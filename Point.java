package Practice;
import java.lang.Math;
public class Point {
	/**�������࣬�к��������������������
	 * ������չʾ�ͼ���������ľ���*/
	private double x,y;
	//˽�б���x��y��ȡ���޸�
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
	//�޲������췽�����в������췽��
	public Point() {
		this(0.0,0.0);
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//չʾ������չʾ��������
	public String Show() {
		return ("�����꣺"+x+"	"+"�����꣺"+y);
	} 
	//����˵��������ľ��룬ÿ���������
	public double distance(Point p) {
		double d = 0;
		d =Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
		return d;
	}
}
