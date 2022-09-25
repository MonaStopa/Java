package Lista02;
import java.util.Scanner;

public class Ex03 {
	
public static void main(String[]args) {
		
	Scanner ler = new Scanner (System.in);
	
	int base, altura, area;
	
	System.out.printf("Informe a base do triangulo: ");
	base = ler.nextInt();
	
	System.out.printf("Informe a altura do triangulo: ");
	altura = ler.nextInt();
	
	area = (base * altura)/2;
	
	System.out.printf("A area do triangulo é: %d m²", area);

}
}
