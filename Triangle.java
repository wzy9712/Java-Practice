package Practice;

import java.util.Scanner;

public class Triangle {

	private static Scanner reader;

	public static void main(String[] args) {
		//�ж�������
		
		reader = new Scanner(System.in);
		System.out.println("����������������ֵ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		TestTriangle.test(a,b,c);
	}

}
class TestTriangle{
	public static void test(int a, int b,int c) {
		if((a+b) > c && (a+c) > b && (b+c) > a) {
			System.out.print("�ܹ���������");
			if(a==b && a==c) {
				System.out.println("�����ǵȱ�������");
			}else{
				System.out.println("�������ǵȱ�������");
			}
		}else {
			System.out.println("���ܹ���������");
		}
	}
}
