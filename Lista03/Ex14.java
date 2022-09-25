package Lista03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double peso, altura, IMC;
		
		System.out.print("Digite o peso da pessoa: ");
		peso = ler.nextDouble();
		
		System.out.print("Digite a altura da pessoa: ");
		altura = ler.nextDouble();
		
		IMC = peso/(altura*altura);
		
		if (IMC < 18.5)
		{
			System.out.printf("A pessoa está com magreza, tendo o IMC em: %.2f", IMC);		
		}
		
		else if (IMC >= 18.5 && IMC <= 24.9)
		{
			System.out.printf("A pessoa está com peso normal, tendo o IMC em: %.2f", IMC);		
		}
		
		else if (IMC >= 25 && IMC <= 29.9)
		{
			System.out.printf("A pessoa está com sobrepeso, tendo o IMC em: %.2f", IMC);		
		}
		
		else if (IMC >= 30 && IMC <=39.9)
		{
			System.out.printf("A pessoa está com obesidade, tendo o IMC em: %.2f", IMC);		
		}
		
		else
		{
			System.out.printf("A pessoa está em obesidade grave, tendo o IMC em: %.2f", IMC);		
		}
		
	}
		
	}
	
