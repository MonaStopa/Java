package Lista03;

import java.util.Scanner;

public class Ex24 {
	public static void main (String[]args) {
		
		 Scanner ler = new Scanner (System.in);

         String nome, sexo, ec;
         double casada;

         System.out.print("Digite o nome da pessoa: ");
         nome = ler.next();

         do
         {
             System.out.print("Digite: F - Feminina | M - Masculina... ");
             sexo = ler.next();
         }while(sexo.charAt(0) != 'F' && sexo.charAt(0) != 'f' && sexo.charAt(0) != 'M' && sexo.charAt(0) != 'm');
         do
         {
             System.out.print("A pessoa é Casada? Digite: S - sim | N - não... ");
             ec = ler.next();
         } while (ec.charAt(0) != 'S'&& ec.charAt(0) != 's'&& ec.charAt(0) != 'N'&& ec.charAt(0) != 'n');

         if(sexo .equals("F") || sexo .equals("f"))
         {
             if (ec .equals("s") || ec .equals("S"))
             {
                 System.out.print("Quantos anos ela é casada: ");
                 casada = ler.nextDouble();

                 System.out.printf("Nome: %s \nSexo: Femino \nEstado Civil: Casada a %.2f anos", nome, sexo, casada);
             }

             else
             {
                 System.out.printf("Nome: %s \nSexo: Femino \nEstado Civil: Solteira", nome, sexo);
             }
         }

         else
         {
             if (ec .equals("s") || ec .equals("S"))
             {
                 System.out.printf("Nome: %s \nSexo: Masculino \nEstado Civil: Casado", nome, sexo);
             }

             else
             {
                 System.out.printf("Nome: %s \nSexo: Masculino \nEstado Civil: Solteira", nome, sexo);
             }
         }
 }
}