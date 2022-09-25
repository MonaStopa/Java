package Lista04;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int total,x=-1,a,b;
		
		while(x<0)
		{
			System.out.print("Digite uma valor para realizar a tabuada: ");
			x = ler.nextInt();
		}
       
		System.out.printf("Digite o primeiro valor do intervalo: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo valor do intervalo (maior que o primeiro): ");
			b = ler.nextInt();
		}
		while(b <= a);
		
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b*x));
	}
}
}
