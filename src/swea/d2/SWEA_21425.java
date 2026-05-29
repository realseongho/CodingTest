package swea.d2;

import java.util.Scanner;

public class SWEA_21425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, A, B, N, BIG, SMALL, tmp;
		T = sc.nextInt();
		int[] result = new int[T];
		
		for(int i=0; i<T; i++) {
			result[i] = 0;
			A = sc.nextInt();
			B = sc.nextInt();
			N = sc.nextInt();
			
			BIG = (A>B)?A:B;
			SMALL = (A>B)?B:A;
			
			do {
				tmp = BIG+SMALL;
				SMALL = BIG;
				BIG = tmp;
				result[i]++;
			} while(BIG<=N);
		}
		
		for(int j=0; j<T; j++)
			System.out.println(result[j]);
	}
}
