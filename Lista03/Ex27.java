package Lista03;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int v, total;
		
		System.out.printf("Digite uma variavel: ");
		v = ler.nextInt();
		
		if(v%2==0) 
		{
			total = v + 5;
			System.out.printf("O numero é par! \n%d + 5 = %d", v,total);
		}
		
		else 
		{
			total = v + 8;
			System.out.printf("O numero é impar! \n%d + 8 = %d", v,total);
		}

	}

}
