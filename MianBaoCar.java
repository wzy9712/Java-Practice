package Practice;

public class MianBaoCar extends Car{
	//����������࣬�̳������࣬���������ؿ���
	int capacity;
	//���췽����super
	public MianBaoCar(int wheelNumber, double carWeight,int capacity) {
		/*this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;*/
		super(wheelNumber, carWeight);
		this.capacity = capacity;
	}
	//��ȡ���޸ı���
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}