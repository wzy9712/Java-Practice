package Practice;
import java.util.Scanner;
public class Test01 {
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("请输入自变量x");
		Double x = reader.nextDouble();
		double y = F.f(x);
		System.out.println("因变量y的值是："+y);
	}
}
