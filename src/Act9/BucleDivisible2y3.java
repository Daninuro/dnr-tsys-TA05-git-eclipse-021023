package Act9;

public class BucleDivisible2y3 
{

	public static void main(String[] args) 
	{

		for(int num=1; num<=100; num++) 
		
		{
			int resto2, resto3;
			
			resto2=num%2;
			resto3=num%3;
			
			if(resto2==0 && resto3==0) 
			{
				System.out.println(num);
			}
			
			
		}
		
	}

}
