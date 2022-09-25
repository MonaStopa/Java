package Lista03;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double A,B,C,D,E;
		
		System.out.print("Digite da hipotenusa: ");
		A = ler.nextDouble();
		
		System.out.print("Digite o valor do CO: ");
		B = ler.nextDouble();
		
		System.out.print("Digite o valor do CA: ");
		C = ler.nextDouble();
		
		D = A * A;
		
		E = (B * B) + (C * C);
	
		
		if (D == E)
		{
			System.out.printf("\nOs valores formam um triangulo retangulo!");
		}
		
		else
		{
			System.out.printf("\nOs valores não formam um triangulo retangulo!");
		}
			
	}
	}
