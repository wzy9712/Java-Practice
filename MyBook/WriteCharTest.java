package JavaCommonClass;
import java.io.*;
public class WriteCharTest {
	public static void main(String[] args) {
		//测试字节输入流
		String path = "C:/Users/wzy/Desktop/FileTest/test.txt";
		File f = new File(path);
		Writer out = null;
		try {
			out = new FileWriter(f);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			out.write("字节流写入读出测试");
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
