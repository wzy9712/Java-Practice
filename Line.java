package Practice;

public class Line {
	//两个实例类型点变量
	private Point p1;
	private Point p2;
	//构造方法
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	//求线段长度
	public double length(){
		return p1.distance(p2);
	}
	//判断线段是否水平
	public boolean isLelve() {
		if(p1.getY() == p2.getY()) {
			return true;
		}else {
			return false;
		}
	} 
	//判断线段是否垂直
	public boolean isVertical() {
		if(p1.getX() == p2.getX()) {
			return true;
		}else {
			return false;
		}
	}
	//求斜率
	public double slope() {
		double k;
		if(isVertical()){
			System.out.println("该线段是垂直的。斜率无穷大");
		}else {
			k = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
			return k;
		}
		return 0.0;
	}
	//求中点
	public Point midpoint() {	
		Point p3 = new Point();
		p3.setX((p1.getX()+p2.getX())/2);
		p3.setY((p1.getY()+p2.getY())/2);
		return p3;
	}
}
