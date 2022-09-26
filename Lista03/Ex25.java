package Lista03;

import java.util.Scanner;

public class Ex25 {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Digite um numero: ");
		
		n = ler.nextInt();
		
		if(n%2==0) 
		{
			System.out.printf("O numero digitado e par! ");
		}
		
		else 
		{
			System.out.printf("O numero digitado e ímpar! ");
		}
	}

}