package Practice;

public class TestCar {

	public static void main(String[] args) {
		// ����������
		Car car1 = new KaCar(4,20.0,30.0);
		System.out.println("���������ӣ�"+car1.getWheelNumber());
		System.out.println("������������"+car1.getCarWeight());
		System.out.println("������װ������"+ car1.getLoadWeight());
		//�ָ���
		System.out.println("-----------------");
		
		Car car2 = new MianBaoCar(4,18.0,8);
		System.out.println("����������ӣ�"+car2.getWheelNumber());
		System.out.println("�������������"+car2.getCarWeight());
		System.out.println("�������װ������"+ car2.getCapacity());
	}
}
