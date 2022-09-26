package Lista04;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int total,n=-1;
		
		while(n<0)
		{
			System.out.print("Digite uma valor para realizar a tabuada: ");
			n = ler.nextInt();
		}
       
		for (int i = 0;i<=10;i++)
		{
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
	}
}
