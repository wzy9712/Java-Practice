package Practice;

public class MianBaoCar extends Car{
	//定义面包车类，继承汽车类，增加属性载客量
	int capacity;
	//构造方法，super
	public MianBaoCar(int wheelNumber, double carWeight,int capacity) {
		/*this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;*/
		super(wheelNumber, carWeight);
		this.capacity = capacity;
	}
	//读取和修改变量
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
