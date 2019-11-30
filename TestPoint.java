package Practice;

public class TestPoint {

	public static void main(String[] args) {
		//测试点类
		Point p1 =new Point(0,0);
		Point p2 =new Point(3,4);
		System.out.println(p1.Show());
		System.out.println(p2.Show());
		System.out.println("两个点的距离是："+p1.distance(p2));
	}
}
