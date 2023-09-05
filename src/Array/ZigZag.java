
public class ZigZag {
	public static void main(String[] args) {
		int a[]= {4, 3, 7, 8, 6, 2, 1} ;
		ZigZag(a);
	}
	static int[] swap(int[] a,int i) {
		int temp=0;
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		return a;
	}

	private static void ZigZag(int[] a) {
		boolean flag=true;//{3, 4, 7, 8, 6, 2, 1} ;
//		{3, 7, 4, 8, 6, 2, 1} ;
		for (int i = 0; i < a.length-1; i++) {
			if(flag==true) {
				if(a[i]>a[i+1]) {
					swap(a,i);
				}
				flag=false;
				
			}
			else{
				if(a[i]<a[i+1]) {
					swap(a,i);
				}
				flag=true;
			}
					
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		
		
	}
}
