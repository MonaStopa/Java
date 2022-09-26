/**
 * 
 */
package Lista02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		int base, altura, area=0;
		
		System.out.print("Informe o valor da base do retangulo:");
		base = ler.nextInt();
		
		System.out.print("Informe a altura do retangulo:");
		altura = ler.nextInt();
		
		area = base * altura;
		
	  System.out.printf("A area do retangulo é: %d", area);
	}
}