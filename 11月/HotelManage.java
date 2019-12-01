import java.util.Scanner;
public class HotelManage {
    public static void main(String[] args) {
        //功能：显示当前房间状况、预定房间、退房
        Scanner reader = new Scanner(System.in);
        Hotel h= new Hotel();
        h.show();
        System.out.println("请输入入住的楼层号和房间号");
        int a = reader.nextInt();
        int b = reader.nextInt();
        h.in(a,b);
        h.show();
        System.out.println("请输入退房的楼层号和房间号");
        int c = reader.nextInt();
        int d = reader.nextInt();
        h.out(c,d);
        h.show();
    }
}
 class  Hotel{
    /*规定酒店：5层，每层10个房间
    1、2层是标准间
    3、4层是双人间
    5层是豪华间
    * */
    Hotel(){
        this(5,10);
    }
    Room[][] Hotel = new Room[5][10];
    Hotel(int rows, int cols) {
        /**for循环初始化宾馆*/
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                Hotel[i - 1][j - 1] = new Room();
                Hotel[i - 1][j - 1].setNo(i*100+j);
                if (i <= 2) {
                    Hotel[i - 1][j - 1].setType("标准间");
                } else if (i <= 4) {
                    Hotel[i - 1][j - 1].setType("双人间");
                } else {
                    Hotel[i - 1][j - 1].setType("豪华间");
                }
                Hotel[i - 1][j - 1].setUse("空置");
            }
        }
    }
    void show(){
        /**向控制台输出所有房间的情况*/
        for (int i = 1; i <= Hotel.length; i++) {
            for (int j = 1; j <= Hotel[i-1].length; j++) {
                System.out.print(Hotel[i-1][j-1].no+" "+Hotel[i-1][j-1].type+" "+Hotel[i-1][j-1].isUse+"   ");
            }
            System.out.println();
        }
    }
    void in(int a, int b){
        Hotel[a-1][b-1].isUse = "占用";
    }
    void out(int a, int b){
        Hotel[a-1][b-1].isUse = "空置";
    }
}

class Room {
    int no;
    String type;//标准间、双人间、豪华间
    String isUse;//ture 表示占用，false表示空着
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String isUse() {
        return isUse;
    }

    public void setUse(String use) {
        isUse = use;
    }
}
