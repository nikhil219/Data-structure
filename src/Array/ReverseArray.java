import java.util.Iterator;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arry= {10, 20, 30, 40, 50};
		int arrayslength=arry.length;
		int[] ar=new int[arrayslength];
		for (int i = arry.length-1; i >= 0; i--) {
			System.out.print(arry[i]+" ");
			ar[i]=arry[i];
			
		}
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		
	}
}
