package Lista03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		double p1,p2,media;
		
		System.out.print("Digite o valor da P1 do aluno: ");
		p1 = ler.nextDouble();
		
		System.out.print("Digite o valor da P2 do aluno: ");
		p2 = ler.nextDouble();
		
		media = (p1 + 2 * p2)/3;
		
		if (media>=5)
		{
			System.out.printf("\nAluno(a) aprovado(a)!! \nMedia: %.2f", media);
		}
		
		else
		{
			System.out.printf("\nAluno(a) reprovado(a)!! \nMedia: %.2f", media);
		}
		
	}
	}
