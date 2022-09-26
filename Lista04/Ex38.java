package Lista04;

public class Ex38 {
	public static void main(String[] args) {
		
		int i=1,num=0;
		
		
		for(i=1;i<=100;i++) {
			if(i%2==0)
			{
				num +=i;	
			}
			}
		System.out.printf("Valor inteiro: %d", num);	
		}		
	}