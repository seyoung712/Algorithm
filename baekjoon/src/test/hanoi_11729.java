//Q) 이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 
package test;
import java.util.Scanner;

public class hanoi_11729 {
	public static StringBuilder sb = new StringBuilder(); //StringBuilder : 1개 이상의 문자열들을 더할 때 사용

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //원반을 입력받음 (N=원반개수)
		
		sb.append((int) (Math.pow(2,N)-1)).append('\n'); //?
		//Math.pow = 제곱
		//sb는 출력되는 부분
		
		Hanoi(N,1,2,3);
		System.out.println(sb); //StringBuilder의 문자열 출력

	}
	
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N==1){ // 이동할 원반이 1개라면,
			sb.append(start + " " + to + '\n'); //출력은 (출발, 도착)
			return;
		}
		
		//A-> C로 옮길 때
		//(1) N-1개를 A에서 B로 이동 (start지점의 N-1개의 원판을 mid로 옮김)
		Hanoi(N-1, start, to, mid); // start -> mid
		//(2) 가장 큰 원반 1개를 A에서 C로 이동 (start 지점의 N번째 원반을 to로 옮긴다)
		sb.append(start + " " + to + '\n'); //가장 큰 원반만 이동 = 이동횟수 1
		//(3) N-1개를 B에서 C로 이동 (mid 지점의 N-1개의 원반을 to로 옮김)
		Hanoi(N-1, mid, start, to); //mid -> to
	}

}
