package Lista04;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String tecla;
		
       for(int n = 1;n<=20;n++)
       {
		for (int i = 0;i<=10;i++)
		{
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
		System.out.print("\nDigite qualquer tecla: ");
		tecla = ler.next();
       }
	}
}
