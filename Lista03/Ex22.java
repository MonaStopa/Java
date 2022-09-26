package Lista03;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double base,altura,area,r,lado;
		int menu=0;
		
		while(menu!=5) {
		
		System.out.print("\n\nMenu \n1 – Triangulo \n2 – quadrado \n3 – retangulo \n4 – circulo \n5 – Fim de processo \nDigite: ");
		menu = ler.nextInt();
		
		switch (menu) {
		case 1:
			System.out.printf("Informe a base do triangulo: ");
			base = ler.nextDouble();
			
			System.out.printf("Informe a altura do triangulo: ");
			altura = ler.nextDouble();
			
			area = (base * altura)/2;
			
			System.out.printf("A area do triangulo é: %.2f m²", area);
			break;
			
		case 2:
			System.out.print("Informe o valor do lado do quadrado: ");
			lado = ler.nextDouble();
			
			area = lado * lado;
			
			System.out.printf("A area do quadrado é: %.2f m²", area);
			break;
			
		case 3:
			System.out.print("Informe o valor da base do retangulo:");
			base = ler.nextDouble();
			
			System.out.print("Informe a altura do retangulo:");
			altura = ler.nextDouble();
			
			area = base * altura;
			
			System.out.printf("A area do retangulo é: %.2f m²", area);
			break;
			
		case 4:
			System.out.print("Digite o raio do circulo: ");
			r = ler.nextDouble();
			
			area = 3.14 * (r *r);
			
			System.out.printf("A area do circulo é: %.2f m²", area);
			break;
			
		case 5:
			System.out.print("\nPrograma Encerrado!");
			break;
			default:
			System.out.print("\nErro! Valor invalido");
				
		
	}}
		
	}
}
