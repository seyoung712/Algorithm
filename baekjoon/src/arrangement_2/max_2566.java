package arrangement_2;
import java.util.*;

public class max_2566 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int max=0;
		int col=0, row=0;
		
		//�Է�
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		
		//�ִ� ã��
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
					col=i; row=j;
				}
			}
		}
		col++; row++;
		
		//���
		System.out.println(max);
		System.out.println(col + " " + row);

	}
}
