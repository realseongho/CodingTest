package swea.d2;

import java.util.Scanner;

public class SWEA_D2_1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, count;
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			count=0;
			if(i>=300) {
				if(((i/100)==3)||((i/100)==6)||((i/100)==9)) count++;
				if((((i%100)/10)==3)||(((i%100)/10)==6)||(((i%100)/10)==9)) count++;
				if(((i%10)==3)||((i%10)==6)||((i%10)==9)) count++;
				
				if(count>0)
					for(; count>0; count--) System.out.printf("-");
				else
					System.out.printf("%d",i);
				System.out.printf(" ");
			}
			else if(i>=30) {
				if((((i%100)/10)==3)||(((i%100)/10)==6)||(((i%100)/10)==9)) count++;
				if(((i%10)==3)||((i%10)==6)||((i%10)==9)) count++;
			
				if(count>0)
					for(; count>0; count--) System.out.printf("-");
				else
					System.out.printf("%d",i);
				System.out.printf(" ");
			}
			else {
				if(((i%10)==3)||((i%10)==6)||((i%10)==9)) System.out.printf("- ");
				else System.out.printf("%d ",i);
			}
		}
		
	}

}
