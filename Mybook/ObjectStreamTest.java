package JavaCommonClass;
import java.io.*;
class Student implements Serializable{
	private String no;//学号
	private String name;//姓名
	private char gender;//性别
	private int age;//年龄
	private String addr;//籍贯
	public Student() {
	}
	public Student(String no, String name, char gender, int age, String addr) {
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
} 
public class ObjectStreamTest {
	public static void main(String[] args) {
		// 对象流测试类
		Student stu1= new Student("10000","张三",'男',16,"北京市");
		Student stu2= new Student("11111","李四",'女',17,"重庆市");
		try {
			//定义对象输出流
			FileOutputStream fos = new FileOutputStream("C:/Users/wzy/Desktop/FileTest/test.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			//将对象写入流
			out.writeObject(stu1);
			out.writeObject(stu2);
			//定义对象写入流
			FileInputStream fis = new FileInputStream("C:/Users/wzy/Desktop/FileTest/test.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			stu1 = null;
			stu2 = null;
			//从流中读取数据
			stu1 = (Student)in.readObject();
			stu2 = (Student)in.readObject();
			in.close();
			System.out.println("学号："+stu1.getNo());
			System.out.println("姓名："+stu1.getName());
			System.out.println("性别："+stu1.getGender());
			System.out.println("年龄："+stu1.getAge());
			System.out.println("地址："+stu1.getAddr());
			System.out.println();
			System.out.println("学号："+stu2.getNo());
			System.out.println("姓名："+stu2.getName());
			System.out.println("性别："+stu2.getGender());
			System.out.println("年龄："+stu2.getAge());
			System.out.println("地址："+stu2.getAddr());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
