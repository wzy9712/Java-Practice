package Practice;

public class TestLine {

	public static void main(String[] args) {
		// �����߶���
		Point p1 =new Point(0,4);
		Point p2 =new Point(3,4);
		Line l = new Line(p1,p2);
		System.out.println("�߶γ����ǣ�"+l.length());
		System.out.println("�߶��ǲ���ˮƽ�ģ�"+l.isLelve());
		System.out.println("�߶��ǲ��Ǵ�ֱ�ģ�"+l.isVertical());
		System.out.println("�߶�б���ǣ�"+l.slope());
		System.out.print("�߶��е��ǣ�"+l.midpoint().Show());
	}
}
