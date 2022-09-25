package Lista02;
import java.util.Scanner;

public class Ex04 {
	public static void main (String[]args){
	
	Scanner ler = new Scanner (System.in);
	
	double n1,n2,n3,n4,media;
	
	System.out.print("Digite o priemeiro valor: ");
	n1 = ler.nextDouble();
	
	System.out.print("Digite o segundo valor: ");
	n2 = ler.nextDouble();
	
	System.out.print("Digite o terceiro valor: ");
	n3 = ler.nextDouble();
	
	System.out.print("Digite o quarto valor: ");
	n4 = ler.nextDouble();
	
	media = (n1 + n2 + n3 + n4)/4;
	
	System.out.printf("O valor da media aritmetica é: %.2f", media);
}
}
