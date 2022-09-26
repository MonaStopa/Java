package Lista02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double p1,p2,p3,p4,p5,total=1,pago=0,troco=0;
		
		System.out.print("Informe o valor do produto 1: R$");
		p1 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 2: R$");
		p2 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 3: R$");
		p3 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 4: R$");
		p4 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 5: R$");
		p5 = ler.nextDouble();
		
		total = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("O valor total dos produtos é: R$%.2f", total);
		
		do
		{
			System.out.print("\nQual o valor do pagamento: R$");
			pago = ler.nextDouble();
			
			if (pago<total)  
			{
				System.out.print("\nValor pago menor que o valor dos produtos..");
			}
			
		}while(pago < total);
		
		troco = pago - total;
		
		
		System.out.printf("\nO troco é: R$%.2f", troco);
	}
}
