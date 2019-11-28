package Practice;

import java.util.Scanner;

public class Triangle {

	private static Scanner reader;

	public static void main(String[] args) {
		//判断三角形
		
		reader = new Scanner(System.in);
		System.out.println("请输入三角形三边值");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		TestTriangle.test(a,b,c);
	}

}
class TestTriangle{
	public static void test(int a, int b,int c) {
		if((a+b) > c && (a+c) > b && (b+c) > a) {
			System.out.print("能构成三角形");
			if(a==b && a==c) {
				System.out.println("；且是等边三角形");
			}else{
				System.out.println("；但不是等边三角形");
			}
		}else {
			System.out.println("不能构成三角形");
		}
	}
}
