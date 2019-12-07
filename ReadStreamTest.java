package JavaCommonClass;
import java.io.*;
public class ReadStreamTest {
	public static void main(String[] args) {
		// 读取测试
		String path = "C:/Users/wzy/Desktop/FileTest/test.txt";
		File f = new File(path);
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		byte[] b= new byte [1024];
		int count = 0 ;//实际字节数
		try {
			count = in.read(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		String str = new String(b,0,count);
		System.out.print(str);
	}
}