package Lista03;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3;
		
		do
		{
		System.out.print("\nDigite tres valores diferetes! \nPrimeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print("Segundo valor: ");
		n2 = ler.nextInt();
		
		System.out.print("Terceiro valor: ");
		n3 = ler.nextInt();
		}while (n1 == n2 && n1 == n3 && n2 == n3);
		
		if(n1<n2) 
		{
			if(n2<n3) 
			{
				System.out.printf("Ordem Crescente: %d, %d, %d.", n3, n2, n1);
			}
			
			else 
			{
				System.out.printf("Ordem Crescente: %d, %d, %d.", n2, n3, n1);
			}
		}
		
		else
		{
			if(n1<n3) 
			{
				System.out.printf("Ordem Crescente: %d, %d, %d.", n3, n1, n2);
			}
			
			else 
			{
				System.out.printf("Ordem Crescente: %d, %d, %d.", n1, n2, n3);
			}
	}

}
}
