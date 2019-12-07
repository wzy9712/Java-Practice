package JavaCommonClass;
import java.io.*;
public class ReadCharTest {
	public static void main(String[] args) {
		// 读取测试
		String path = "C:/Users/wzy/Desktop/FileTest/test.txt";
		File f = new File(path);
		Reader in = null;
		try {
			in = new FileReader(f);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		char[] b= new char[1024];
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