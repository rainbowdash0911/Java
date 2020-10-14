
import java.util.Scanner;
import java.math.BigDecimal;


public class SimpleComputing {
	
	
	public static void main (String args[])
	{
		int max=0;
		System.out.println("Podaj a");
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt(); 
		try {
			
			for (int i=0; i<=max; i++)
			{
				System.out.println("Silnia dla "+i+" = "+Euclides(i));
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Blad! To nie jest liczba ca³kowita"); 
		}
		
		
	}

	private static BigDecimal silnia3(int x) {
		
		BigDecimal result =new BigDecimal (1);
		
		
		for (int i = 1; i <=x; i++) {
			result = result.multiply(new BigDecimal(i));
			
			
		}
		return result;
		
	}

	/*	private static long silnia4(int x) {
			
				if (x == 1) {
					return 1;
				}
				if (x == 0) {
					return 0;
				}
			
				
				      return x * silnia4(x - 1);
				 
				      
	} */

		private static long fibClassic(int x) {
			  long x1 = 1;
			  long x2 = 1;
			  for (int i = 3; i <= x; i++) {
			    long temp = x1 + x2;
			    x1 = x2;
			    x2 = temp;
			  }
			  return x2;
			}
		
		
			public static int Euclides(int a, int b){
		    int tmp;
		    while(b != 0){
		        tmp = a % b;
		        a = b;
		        b = tmp;
		    }
		    return a;
		} }

	

