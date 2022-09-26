package Lista03;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double p1,p2,media=5;
		
		System.out.print("Digite o valor da P1 do aluno: ");
		p1 = ler.nextDouble();
		
		p2=((3*media) - p1)/2;
		
		System.out.printf("\nO aluno vai precisar tirar %.2f na P2", p2);
		
	}
	}
