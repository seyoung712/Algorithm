package sort;
import java.util.Scanner;

public class representativeValue_2587 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int avg = 0; //��հ� ����
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt(); //���� �Է¹޾�
			avg += arr[i]; //����
		}//for
		
		System.out.println(avg/5);//��հ� ���
		
		//����
		int tmp;
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<=4; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[2]); //�߾Ӱ� ���
		
		

	}//main
}//class
