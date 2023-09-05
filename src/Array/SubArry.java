
public class SubArry {
	public static void main(String[] args) {
		int a[]={1, 4, 20, 3, 10, 5};
		int sum=33;
		int n=5;
		betweenSubArray(a,sum,n);
		
	}

	private static int betweenSubArray(int[] a, int sum, int n) {
		int currentsum=a[0],start=0;
		for (int i = 0; i < a.length; i++) {
			
			while(currentsum>sum) {
				currentsum =currentsum-a[start];
				start++;
			}
			if(currentsum==sum) {
				System.out.println("Sum found between indexes"+start+"and"+i);
			}
			if (currentsum<sum){ 
				currentsum+=currentsum+a[i];
				
			}
			
		}
		return 0;
		
	}
}
