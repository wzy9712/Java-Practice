package Practice;

public class KaCar extends Car{
	//定义卡车类，继承汽车类，添加属性装载量
	double loadWeight;
	//构造方法，super应用
	public KaCar(int wheelNumber, double carWeight,double loadWeight) {
		/*this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;*/
		super(wheelNumber,carWeight);
		this.loadWeight = loadWeight;
	}
	//读取和修改变量
	public double getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
}