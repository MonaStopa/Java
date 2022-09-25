package Lista03;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double v1,v2,total;
		int menu=0;
		
		while(menu!=5) {
		System.out.print("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.print("\n\nMenu \n1 – Multiplicação \n2 – Adição \n3 – Divisão \n4 – Subtração \n5 – Fim de processo \nDigite: ");
		menu = ler.nextInt();
		
		switch (menu) {
		case 1:
			total = v1 * v2;
			System.out.printf("\n%.2f * %.2f = %.2f",v1,v2,total);
			break;
		case 2:
			total = v1 + v2;
			System.out.printf("\n%.2f + %.2f = %.2f",v1,v2,total);
			break;
		case 3:
			if (v2 != 0) {
			total = v1 / v2;
			System.out.printf("\n%.2f / %.2f = %.2f",v1,v2,total);
			}
			else 
			{
				System.out.print("ERRO! Não é possivel dividir por 0");
			}
			break;
		case 4:
			total = v1 - v2;
			System.out.printf("\n%.2f - %.2f = %.2f",v1,v2,total);
			break;
		case 5:
			System.out.print("\nPrograma Encerrado!");
			break;
			default:
			System.out.print("\nErro! Valor invalido");
				
		
	}}
		
	}
}
