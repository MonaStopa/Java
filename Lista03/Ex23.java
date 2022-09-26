package Lista03;

import java.util.Scanner;

public class Ex23 {
	public static void main (String[]args) {
	
	Scanner ler = new Scanner (System.in);
	
	double A,B,C,soma;
	
	System.out.print("Digite o valor de A: ");
	A = ler.nextDouble();
	
	System.out.print("Digite o valor de B: ");
	B = ler.nextDouble();
	
	System.out.print("Digite o valor de C: ");
	C = ler.nextDouble();
	
	soma = A + B;
	
	if (soma<C)
	{
		System.out.printf("A soma de A + B é menor que C, %.2f + %.2f = %.2f", A,B,soma);
	}
	
	else 
	{
		System.out.print("A soma de A + B é não é menor que C");
	}
	}
}
