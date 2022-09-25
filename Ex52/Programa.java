package Ex52;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Produto [] listaProduto = new Produto[10];
		
		try (Scanner ler = new Scanner (System.in)) {
			for (int i=0; i<10; i++) {
				
				Produto a = new Produto();
			
			a.id = i+1;
			
			System.out.printf("Digite o nome do produto: ");
			a.descricao = ler.next();
			
			System.out.printf("Digite o valor: ");
			a.valor = ler.nextDouble();
			
			System.out.printf("Digite a quantidade: ");
			a.quantidade = ler.nextDouble();
			
			System.out.printf("\n");
			
			listaProduto[i] = a;
			
			}
		}
		
		for (int i=0; i<10; i++) {
			
			if(listaProduto[i].valor < 100)		{	
			System.out.printf("Produto %d: %s R$%.2f - %.2f \n", listaProduto[i].id, listaProduto[i].descricao, listaProduto[i].valor,listaProduto[i].quantidade);
			}
			
		}
		
	}
	
}

