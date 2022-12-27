package arrangement_1;

import java.util.Scanner;

public class counting_10807 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//입력
		int N = in.nextInt();
		int[] arr = new int[N];
		int cnt=0;
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		int v = in.nextInt();
		
		//카운팅
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==v) cnt++;
		}
		
		//출력
		System.out.println(cnt);
	}

}
