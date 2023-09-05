import java.util.ArrayList;

public class LeaderArray {
	public static void main(String[] args) {
		int a[] = {16,17,4,3,5,2};
		ArrayList<Integer> Leaderarray=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (i==a.length-1) {
				Leaderarray.add(a[i]);
				continue;
			}
			if (a[i]>a[i+1]) {
				if(a[i+1]<a[i]) {
				Leaderarray.add(a[i]);
				continue;
				}
				
			}
			
		}
	}
	

}
