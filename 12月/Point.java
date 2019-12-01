package Practice;
import java.lang.Math;
public class Point {
	/**创建点类，有横坐标和纵坐标两种属性
	 * 方法有展示和计算两个点的距离*/
	private double x,y;
	//私有变量x，y读取和修改
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	//无参数构造方法和有参数构造方法
	public Point() {
		this(0.0,0.0);
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//展示方法，展示横纵坐标
	public String Show() {
		return ("横坐标："+x+"	"+"纵坐标："+y);
	} 
	//计算此点和其他点的距离，每个点对象都有
	public double distance(Point p) {
		double d = 0;
		d =Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
		return d;
	}
}
