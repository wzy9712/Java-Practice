package Practice;
import java.util.Scanner;
public class TestScore {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.print("������ɼ�");
		double Score = reader.nextDouble();
		if(Score > 100 || Score < 0) {
			System.out.println("�ɼ����Ϸ�");
		}else if(Score >= 90) {
			System.out.println("�ɼ��ȼ�ΪA");
		}else if(Score >=  80) {
			System.out.println("�ɼ��ȼ�ΪB");
		}else if(Score >= 70) {
			System.out.println("�ɼ��ȼ�ΪC");
		}else if(Score >= 60) {
			System.out.println("�ɼ��ȼ�ΪD");
		}else{
			System.out.println("�ɼ��ȼ�ΪE");
		
		}
	}

}
