package Ex51;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Cliente [] listaCliente = new Cliente[5];
		
		try (Scanner ler = new Scanner (System.in)) {
			for (int i=0; i<5; i++) {
				
			Cliente a = new Cliente();

			a.id = i + 1;
			
			System.out.printf("Digite o nome: ");
			a.nome = ler.next();
			
			System.out.printf("Digite o idade: ");
			a.idade = ler.nextInt();
			
			System.out.printf("Digite o email: ");
			a.email = ler.next();
			
			System.out.printf("\n");
			
			listaCliente [i] = a;
			
			}
		}
		
		for (int i=0; i<5; i++) {
			
			if(listaCliente[i].idade >= 18)		{	
			System.out.printf("\n Cliente %d \n nome: %s \n idade: %d anos \n email: %s \n\n", listaCliente[i].id, listaCliente[i].nome, listaCliente[i].idade,listaCliente[i].email);
			}	
		}	
	}	
}
