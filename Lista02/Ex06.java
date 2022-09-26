package Lista02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double D, R, cotacao;
		
		System.out.printf("Digite o valor da cotaçao atual: ");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite o valor em dolar: $");
		D = ler.nextDouble();
		
		R = D * cotacao;
		
		System.out.printf("O valor em reais é: R$%.2f", R);
	
	}
}