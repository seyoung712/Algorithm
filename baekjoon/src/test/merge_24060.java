package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class merge_24060 {

	static int[] A, tmp; // A : 기존 배열 / tmp : 담아놓을 배열
	//static int count = 0;
	//static int result = -1;
	//static int K;
	
	public static void main(String[] args) throws IOException { //입출력 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner 기능
		StringTokenizer st = new StringTokenizer(br.readLine()); //문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
		
		int N = Integer.parseInt(st.nextToken()); //nextToken : StringTokenizer에서 다음 토큰을 불러오는 메서드
		//K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		A = new int[N]; //N : 쪼개진 문자열을 정수로 (크기)
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[N]; //새로운 배열 크기 설정
		merge_sort(A, 0, N - 1); // 인자->(배열, 왼쪽끝, 오른쪽끝)
		//System.out.println(result);
		
		//출력
		for(int i=0;i<=N;i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void merge_sort(int[] A, int p, int r) { //(배열, 왼쪽끝, 오른쪽끝)
		//if (count > K) return ;
		if (p < r) {
			int q = (p + r) / 2; //q : 중간
			//나누는 과정
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			//병합정렬
			merge(A, p, q, r); //(배열, 왼쪽, 중간, 오른쪽)
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) { //(배열, 왼쪽, 중간, 오른쪽)
		//새로 담을 배열 인덱스
		int i = p; //왼
		int j = q + 1; //중간+1
		int t = 0; // 새 배열 인덱스
		
		//왼쪽부분 정렬
		while (i <= q && j <= r) {
			if(A[i] <= A[j]) { //왼쪽 값이 더 작다면
				tmp[t] = A[i];
				i++;
			}else {
				tmp[t] = A[j];  //오른쪽 값이 더 작다면
				j++;
			}
			t++; //인덱스 증가
		}
		
		//내림차순이라든가, 미처 정렬되지 않은 나머지 부분을 정렬(?)
		while (i <= q)
			tmp[t++] = A[i++];

		while (j <= r) 
			tmp[t++] = A[j++];

		i = p;
		t = 0; //새 배열 인덱스 초기화
		while (i <= r) {
			/*count++;
			if (count == K) {
				result = tmp[t];
				break;
			} */
			A[i++] = tmp[t++]; //원래 배열로 옮겨담기
		}
	}


}
