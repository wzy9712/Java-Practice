package Practice;
import java.util.Scanner;
public class TestScore {
	private static Scanner reader;
	public static void main(String[] args) {
		/**输入成绩[0-100]，返回成绩区间*/
		reader = new Scanner(System.in);
		System.out.print("请输入成绩");
		double Score = reader.nextDouble();
		/*if(Score > 100 || Score < 0) {
			System.out.println("成绩不合法");
		}else if(Score >= 90) {
			System.out.println("成绩等级为A");
		}else if(Score >=  80) {
			System.out.println("成绩等级为B");
		}else if(Score >= 70) {
			System.out.println("成绩等级为C");
		}else if(Score >= 60) {
			System.out.println("成绩等级为D");
		}else{
			System.out.println("成绩等级为E");
		
		}*/
		int s = (int)(Score/10);
		switch(s){
			case 6:System.out.println("成绩等级为D");break;
			case 7:System.out.println("成绩等级为C");break;
			case 8:System.out.println("成绩等级为B");break;
			case 9:System.out.println("成绩等级为A");break;
			case 10:System.out.println("恭喜您获得满分");break;
			default:System.out.println("成绩等级为E");
		}
	}
}
