package cn.io.study3;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流
 * @author dell
 *
 */
public class PrintTest {;
	public static void main(String[] args) throws IOException {
		//打印流System.out
		PrintStream ps=System.out;
		ps.println("打印流");
		ps.println(true);
		
		ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("aaa.txt")),true);//加入缓冲流后必须刷新
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("copyaaa.txt")),true);
		ps.println("打印流");
		ps.println('a');
		pw.println(1234);
		pw.println("打印流");
		pw.println('b');
		//重定向输出端
		System.setOut(ps);
		System.out.print("i'm printing");
		ps.close();
		//重定向回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));//加入缓冲流后必须刷新
		System.out.println("i'm backing");
		
		
	}

}
