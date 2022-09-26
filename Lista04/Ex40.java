package Lista04;

public class Ex40 {
	public static void main(String[] args) {
	
		int soma, a = 1, b = 1, c = 1;
		
		for(int i = 0; i < 20; i++) 
		{
			if(i < 3) 
			{
				System.out.printf("1");
			}
			else 
			{
				soma = a + b + c;
				System.out.printf("%d", (soma));
				c = b;
				b = a;
				a = soma;
			}
			
		}
	}

}
