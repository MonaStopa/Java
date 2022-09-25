package Lista04;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int sum = 0, ln = 2, n = 0, seq = 0;
		
		while(n <= 100 || n > 1);
		{
			System.out.println("\nInsira quantos valores você deseja que sejam somados da sequencia (0 > N < 100): ");
			n = ler.nextInt();
		}
		
		for(int x = 0; x < n; x++) 
		{
				seq += ln;
				sum += seq;
				ln = 3 + 2 * x;
		}
		
		System.out.printf("\nA soma dos %d primeiros numeros da sequencia e: %d", n, sum);
	}
}
