package Lista03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[]args) {

		Scanner ler = new Scanner (System.in);
		
		
		double a,v0,t,V;
		
		System.out.print("Digite a aceleração do automóvel: ");
		a = ler.nextDouble();
		
		System.out.print("Digite a velocidade inicial do automóvel: ");
		v0 = ler.nextDouble();
		
		System.out.print("Digite o tempo de percurso do automóvel: ");
		t = ler.nextDouble();
		
		V = v0 + a * t;
		
		if (V <= 40)
		{
			System.out.printf("Veículo muito lento!! Estando a %.2f m/s", V);
		}
		
		else if (V > 40 && V <= 60)
		{
			System.out.printf("Velocidade permitida!! Estando a %.2f m/s", V);
		}
		
		else if (V > 60 && V <= 80)
		{
			System.out.printf("Velocidade de cruzeiro!! Estando a %.2f m/s", V);
		}
		
		else if (V > 80 && V <= 120)
		{
			System.out.printf("Veiculo rapido!! Estando a %.2f m/s", V);
		}
		
		else 
		{
			System.out.printf("Veiculo muito rapido!! Estando a %.2f m/s", V);
		}
		
	}
		
	}

