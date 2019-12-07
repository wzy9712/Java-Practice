package JavaCommonClass;
import java.io.*;
public class WriteStreamTest {
	public static void main(String[] args) {
		//测试字节输入流
		String path = "C:/Users/wzy/Desktop/FileTest/test.txt";
		File f = new File(path);
		OutputStream out = null;
		try {
			out = new FileOutputStream(f,true);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		byte[] b= "HelloWorld!".getBytes();
		try {
			out.write(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}