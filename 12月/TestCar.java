package Practice;

public class TestCar {

	public static void main(String[] args) {
		// 测试汽车类
		Car car1 = new KaCar(4,20.0,30.0);
		System.out.println("卡车的轮子："+car1.getWheelNumber());
		System.out.println("卡车的重量："+car1.getCarWeight());
		System.out.println("卡车的装载量："+ car1.getLoadWeight());
		//分割线
		System.out.println("-----------------");
		
		Car car2 = new MianBaoCar(4,18.0,8);
		System.out.println("面包车的轮子："+car2.getWheelNumber());
		System.out.println("面包车的重量："+car2.getCarWeight());
		System.out.println("面包车的装载量："+ car2.getCapacity());
	}
}
