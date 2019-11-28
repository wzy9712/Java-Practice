package Practice;
public class Circle {
	private int r;
	public void setRadius(int r) {
		this.r = r;
	}
	public double getArea(){
		return (r*r*Math.PI);
	}
	public double getPerimeter(){
		return (2*Math.PI*r);
	}
	public int getRadius(){
		return r;
	}
 }
