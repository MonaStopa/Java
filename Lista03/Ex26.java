package Lista03;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, total;
		
		System.out.printf("Digite um numero: ");
		n = ler.nextInt();
		
		if(n<0) 
		{
			total = n*3;
			System.out.printf("O numero é negativo, seu triplo é: %d", total);
		}
		
		else 
		{
			total = n*2;
			System.out.printf("O numero é positivo, seu dobro é: %d", total);
		}

	}

}
