//��
package arrangement_1;

import java.util.Scanner;

public class avg_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt(); //�׽�Ʈ ���̽� ����
		int[] arr; //�迭 ����
		
		for(int i=0; i<c; i++) {
			int N = scan.nextInt(); //�л� �� �Է�
			arr = new int[N]; //�л� ����ŭ �迭 ũ�� ����
			
			double sum=0; //���� �� ����
			
			//���� �Է�
			for(int j=0; j<N; j++) {
				int grade = scan.nextInt();
				arr[j] = grade; //�迭�� ������ �ְ�
				sum += grade; //����
			}//for(j)
			
			double avg = (sum/N);
			double count = 0; //��� �Ѵ� �л� �� (������ ���� double�� ����)
			
			//����� �Ѵ� �л� ���� ���
			for (int j=0; j<N; j++) {
				if(arr[j]>avg) { //������ ����� �Ѵ´ٸ�
					count++; //�л� �� +1
				}
			}//for(j)
			
			System.out.printf("%.3f%%\n",(count/N)*100); //��
			
		}//for(i)
		scan.close();
		
	}//main
}//class
