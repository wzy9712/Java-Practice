package JavaCommonClass;

public class ForEach {

	public static void main(String[] args) {
		// for增强语句
		/*int[] ints1 ={1,2,3,4,5,6,7,8,9,10};
		for (int a:ints1){
			 System.out.print(a);
			System.out.print(","); 
			} 
		System.out.print("\n"); 
		String[] strs = { "string1", "string2", "string3", "string4" }; 
		for (String str:strs){   
		System.out.print(str);
		System.out.print(",");} */
		int[] ints = {1,2,3,4,5,6,7,8,9,10};
		for(int x:ints) {
			System.out.print(x+" ");
		}
		String[] s={"string1","string2"}; 
		for(String s1:s) {
			System.out.print(s1+" ");
		}

	}
}