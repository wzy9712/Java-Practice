package Practice;
import java.util.Scanner;
public class Test01 {
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("�����Ա���x");
		Double x = reader.nextDouble();
		double y = F.f(x);
		System.out.println("������ֵΪ"+y);
	}
}
