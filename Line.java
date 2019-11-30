package Practice;

public class Line {
	//����ʵ�����͵����
	private Point p1;
	private Point p2;
	//���췽��
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	//���߶γ���
	public double length(){
		return p1.distance(p2);
	}
	//�ж��߶��Ƿ�ˮƽ
	public boolean isLelve() {
		if(p1.getY() == p2.getY()) {
			return true;
		}else {
			return false;
		}
	} 
	//�ж��߶��Ƿ�ֱ
	public boolean isVertical() {
		if(p1.getX() == p2.getX()) {
			return true;
		}else {
			return false;
		}
	}
	//��б��
	public double slope() {
		double k;
		if(isVertical()){
			System.out.println("���߶��Ǵ�ֱ�ġ�б�������");
		}else {
			k = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
			return k;
		}
		return 0.0;
	}
	//���е�
	public Point midpoint() {	
		Point p3 = new Point();
		p3.setX((p1.getX()+p2.getX())/2);
		p3.setY((p1.getY()+p2.getY())/2);
		return p3;
	}
}
