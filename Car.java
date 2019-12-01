package Practice;

public class Car {
	//定义汽车类
	int wheelNumber;
	double carWeight;
	//构造方法，初始化属性变量
	public Car() {
		this(0,0.0);
	}
	public Car(int wheelNumber, double carWeight) {
		this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;
	}
	//读取和修改属性变量
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
	//两个子类中的方法，多态，编译期不报错
	public double getLoadWeight() {
		return 0;
	}
	public void setLoadWeight(double loadWeight) {}
	public int getCapacity() {
		return 0;
	}
	public void setCapacity(int capacity) {}
}