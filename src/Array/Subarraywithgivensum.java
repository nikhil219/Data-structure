
public class Subarraywithgivensum {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int S=15;
	int max=0;
	boolean valuefindout=false;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i; j < a.length; j++) {
			max=max+a[j];
			if(max==S) {
				System.out.print(i+1 +" ");
				System.out.println(j+1);
				valuefindout=true;
				break;
			}
			if(max>S) {
				max=0;
				break;
			}
			if (valuefindout) {
				break;
			}
			
			

		}
		if (valuefindout) {
			break;
		}
		
	}
}

}
