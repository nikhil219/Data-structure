import java.util.Iterator;

public class FindingSubArray {
	public static void main(String[] args) {
		int a[]=  {1, 4, 0, 0, 3, 10, 5};
		int sum=7;
		maxsumarray(a, sum);
	}

	private static void maxsumarray(int[] a, int sum) {
		for (int i = 0; i < a.length; i++) {
			int currentsum=0;
			boolean foundout=false;
			if(currentsum==sum) {
				System.out.println("Sum found at indexe "
                        + i);

				return;
				
			}else {
				for (int j = i; j < a.length; j++) {
					if(currentsum==sum) {
						System.out.println("Sum found at indexe "
                        + i+" "+(j-1));
						return;
						
					}else {
						currentsum=currentsum+a[j];
					}
					
				}
			}
		}
	}
}
