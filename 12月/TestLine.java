package Practice;

public class TestLine {

	public static void main(String[] args) {
		// 测试线段类
		Point p1 =new Point(0,4);
		Point p2 =new Point(3,4);
		Line l = new Line(p1,p2);
		System.out.println("线段长的是："+l.length());
		System.out.println("线段是不是水平的："+l.isLelve());
		System.out.println("线段是不是垂直的："+l.isVertical());
		System.out.println("线段斜率是："+l.slope());
		System.out.print("线段中点是："+l.midpoint().Show());
	}
}
