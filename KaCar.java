package Practice;

public class KaCar extends Car{
	//���忨���࣬�̳������࣬�������װ����
	double loadWeight;
	//���췽����superӦ��
	public KaCar(int wheelNumber, double carWeight,double loadWeight) {
		/*this.wheelNumber = wheelNumber;
		this.carWeight = carWeight;*/
		super(wheelNumber,carWeight);
		this.loadWeight = loadWeight;
	}
	//��ȡ���޸ı���
	public double getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
}