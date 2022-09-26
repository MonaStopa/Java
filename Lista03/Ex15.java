package Lista03;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double l1,l2,l3;
		
		System.out.print("Digite o valor do lado do triangulo: ");
		l2 = ler.nextDouble();
		
		System.out.print("Digite o valor do lado do triangulo: ");
		l1 = ler.nextDouble();
		
		System.out.print("Digite o valor do lado do triangulo: ");
		l3 = ler.nextDouble();
		
		if (l1 != l2 && l1 != l2 && l2 != l3)
		{
			System.out.printf("\nO triangulo é Escaleno!");
		}
		
		else if (l1 == l2 && l2 == l3)
		{
			System.out.printf("\nO triangulo é Equilatero!");
		}
		
		else
		{
			System.out.printf("\nO triangulo é Isosceles!");
		}
			
	}
	}
