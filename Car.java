package Practice;

public class Car {
	//����������
	int wheelNumber;
	double carWeight;
	//���췽������ʼ�����Ա���
	public Car() {
		this(0,0.0);
	}
	public Car(int wheelNumber, double carWeight) {
		this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;
	}
	//��ȡ���޸����Ա���
	public int getWheelNumber() {
		return wheelNumber;
	}
	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	public double getCarWeight() {
		return carWeight;
	}
	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}
	//���������еķ�������̬�������ڲ�����
	public double getLoadWeight() {
		return 0;
	}
	public void setLoadWeight(double loadWeight) {}
	public int getCapacity() {
		return 0;
	}
	public void setCapacity(int capacity) {}
}