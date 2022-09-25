package Lista02;
import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		int lado, area=0;
		
		System.out.print("Informe o valor do lado do quadrado: ");
		lado = ler.nextInt();
		
		area = lado * lado;
		
	  System.out.printf("A area do quadrado é: %d m²", area);
	}
}
