package Lista03;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double base, altura, area=0;
		
		System.out.print("Informe o valor da base do retangulo:");
		base = ler.nextDouble();
		
		System.out.print("Informe a altura do retangulo:");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (area>100)
		{
			System.out.printf("\nTerreno Grande! Com %.2f m²", area);
		}
		
		else 
		{
			System.out.printf("\nTerreno Pequeno! Com %.2f m²", area);
		}
	
}
}
