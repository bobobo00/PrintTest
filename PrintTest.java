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
 * ��ӡ��
 * @author dell
 *
 */
public class PrintTest {;
	public static void main(String[] args) throws IOException {
		//��ӡ��System.out
		PrintStream ps=System.out;
		ps.println("��ӡ��");
		ps.println(true);
		
		ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("aaa.txt")),true);//���뻺���������ˢ��
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("copyaaa.txt")),true);
		ps.println("��ӡ��");
		ps.println('a');
		pw.println(1234);
		pw.println("��ӡ��");
		pw.println('b');
		//�ض��������
		System.setOut(ps);
		System.out.print("i'm printing");
		ps.close();
		//�ض���ؿ���̨
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));//���뻺���������ˢ��
		System.out.println("i'm backing");
		
		
	}

}
