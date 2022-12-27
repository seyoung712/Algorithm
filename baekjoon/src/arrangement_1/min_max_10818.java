package arrangement_1;
import java.util.*;

public class min_max_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int min=0, max=0;
		int tmp;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		//Á¤·Ä
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		min=arr[0];
		max=arr[arr.length-1];
		
		System.out.println(min + " " + max);

	}
}
