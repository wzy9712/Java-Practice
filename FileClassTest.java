package JavaCommonClass;
import java.io.*;
import java.util.Calendar;
public class FileClassTest {

	public static void main(String[] args) {
		// 测试file类
		String path = "C:\\Users\\wzy\\Desktop\\FileTest\\test.txt";
		File f = new File(path);
		if(f.exists()) {
			System.out.println("文件已存在");
			
			long time = f.lastModified();//获取文件最后修改时间
			Calendar cal = Calendar.getInstance();//实例化日历类
			cal.setTimeInMillis(time);//将long秒转化成时分秒形式
			System.out.println("文件最后修改时间"+cal.getTime().toString());
			System.out.println("	"+time);
		}else {
			System.out.println("文件"+path+"不存在");
			try {
				f.createNewFile();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println(f.canRead()?"文件可读":"文件不可读");
		System.out.println(f.canWrite()?"文件可写":"文件不可写");
		System.out.println(f.canExecute()?"文件可执行":"文件不可执行");
		System.out.println(path+(f.isDirectory()?"是目录":"不是目录"));
		System.out.println(path+(f.isFile()?"是文件":"不是文件"));
		System.out.println(path+(f.isHidden()?"隐藏":"不隐藏"));
		System.out.println("文件大小："+f.length()+"字节");
		System.out.println("文件绝对路径："+f.getAbsolutePath());
		System.out.println("文件路径："+f.getPath());
		System.out.println("文件父目录："+f.getParent());
	}
}
