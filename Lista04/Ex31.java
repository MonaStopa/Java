package Lista04;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1=-1;
		
		while(n1 < 0)
		{
		System.out.print("Digite um valor positivo: ");
		n1 = ler.nextInt();
		}
		
		System.out.printf("O valor %d é positivo!", n1);

}	
}
