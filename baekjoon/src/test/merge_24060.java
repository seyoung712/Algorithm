package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class merge_24060 {

	static int[] A, tmp; // A : ���� �迭 / tmp : ��Ƴ��� �迭
	//static int count = 0;
	//static int result = -1;
	//static int K;
	
	public static void main(String[] args) throws IOException { //����� ����ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner ���
		StringTokenizer st = new StringTokenizer(br.readLine()); //���ڿ��� �츮�� ������ �����ڷ� ���ڿ��� �ɰ��ִ� Ŭ����
		
		int N = Integer.parseInt(st.nextToken()); //nextToken : StringTokenizer���� ���� ��ū�� �ҷ����� �޼���
		//K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		A = new int[N]; //N : �ɰ��� ���ڿ��� ������ (ũ��)
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[N]; //���ο� �迭 ũ�� ����
		merge_sort(A, 0, N - 1); // ����->(�迭, ���ʳ�, �����ʳ�)
		//System.out.println(result);
		
		//���
		for(int i=0;i<=N;i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void merge_sort(int[] A, int p, int r) { //(�迭, ���ʳ�, �����ʳ�)
		//if (count > K) return ;
		if (p < r) {
			int q = (p + r) / 2; //q : �߰�
			//������ ����
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			//��������
			merge(A, p, q, r); //(�迭, ����, �߰�, ������)
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) { //(�迭, ����, �߰�, ������)
		//���� ���� �迭 �ε���
		int i = p; //��
		int j = q + 1; //�߰�+1
		int t = 0; // �� �迭 �ε���
		
		//���ʺκ� ����
		while (i <= q && j <= r) {
			if(A[i] <= A[j]) { //���� ���� �� �۴ٸ�
				tmp[t] = A[i];
				i++;
			}else {
				tmp[t] = A[j];  //������ ���� �� �۴ٸ�
				j++;
			}
			t++; //�ε��� ����
		}
		
		//���������̶�簡, ��ó ���ĵ��� ���� ������ �κ��� ����(?)
		while (i <= q)
			tmp[t++] = A[i++];

		while (j <= r) 
			tmp[t++] = A[j++];

		i = p;
		t = 0; //�� �迭 �ε��� �ʱ�ȭ
		while (i <= r) {
			/*count++;
			if (count == K) {
				result = tmp[t];
				break;
			} */
			A[i++] = tmp[t++]; //���� �迭�� �Űܴ��
		}
	}


}
