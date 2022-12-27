package repeat;
import java.util.*;

public class hap_8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int hap = 0;
		
		for(int i=1; i<=n; i++) {
			hap += i;
		}
		System.out.println(hap);

	}

}
