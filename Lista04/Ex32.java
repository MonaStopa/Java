package Lista04;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double v1,v2;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		while(v1 > v2)
		{
		System.out.print("Segundo valor menor que o primeiro \nDigite novamento o segundo valor: ");
		v2 = ler.nextInt();
		}
		
		System.out.printf("Primeiro valor: %.2f | Segundo valor: %.2f", v1, v2);
}	
}
