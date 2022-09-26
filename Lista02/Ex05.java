package Lista02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double C, F;
		
		System.out.print("Digite a temperatura em graus Celcius: ");
		C = ler.nextDouble();
		
		F = (C * 1.8) + 32;
		
	 System.out.printf("A temperatura em Fahrenheit é: %.2f", F);

	}
}


