package JavaCommonClass;

public class TestSystem {

	public static void main(String[] args) {
		//����System�� 
		/*System.out.println("user.dir="+System.getProperty("user.dir"));
		System.out.println("user.name="+System.getProperty("user.name"));
		System.out.println("os.name="+System.getProperty("os.name"));
		System.out.println("os.arch="+System.getProperty("os.arch"));
		System.out.println("os.version="+System.getProperty("os.version"));
		System.exit(1);
		System.out.println("time"+System.currentTimeMillis());*/
		try {
			int [] a = {1,2,3,4};//java.lang.ArrayIndexOutOfBoundsException
			int [] b = {5,6};
			System.arraycopy(a,0,b,2, 2);
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
		}catch (Exception e) {
			System.out.println("数组越界");
		}
		
	}
}
