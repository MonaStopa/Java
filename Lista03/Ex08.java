package Lista03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double v1,v2;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		if (v1>v2)
		{
			System.out.printf("O primeiro valor é maior, que é: %.2f", v1);
		}
		
		else
		{
			System.out.printf("O segundo valor é maior, que é: %.2f", v2);
		}
		
	}
	}
