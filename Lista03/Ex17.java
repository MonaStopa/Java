package Lista03;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		
		double peso, altura, IMC;
		String sexo;
		
		System.out.print("Digite o peso da pessoa: ");
		peso = ler.nextDouble();
		
		System.out.print("Digite a altura da pessoa: ");
		altura = ler.nextDouble();
		
		IMC = peso/(altura*altura);
		
		
		System.out.print("\nDigite F - Feminino | M - Mascolino\n");
		sexo = ler.next();
		
		switch (sexo) {
		case "F":
			if (IMC < 19)
			{
				System.out.printf("A pessoa está ABAIXO DO PESO, tendo o IMC em: %.2f", IMC);		
			}
			
			else if (IMC >= 19 && IMC < 24)
			{
				System.out.printf("A pessoa está com PESO IDEAL, tendo o IMC em: %.2f", IMC);		
			}
			
			else 
			{
				System.out.printf("A pessoa está ACIMA DO PESO, tendo o IMC em: %.2f", IMC);		
			}
			break;
			
		case "M":
			if (IMC < 20)
			{
				System.out.printf("A pessoa está ABAIXO DO PESO, tendo o IMC em: %.2f", IMC);		
			}
			
			else if (IMC >= 20 && IMC < 25)
			{
				System.out.printf("A pessoa está com PESO IDEAL, tendo o IMC em: %.2f", IMC);		
			}
			
			else 
			{
				System.out.printf("A pessoa está ACIMA DO PESO, tendo o IMC em: %.2f", IMC);		
			}
			break;
			
			default:
				System.out.printf("ERRO!");	
				
		}
		
	}
		
	}
