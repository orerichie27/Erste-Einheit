
public class Schleifen {

	public static void main(String[] args) {
	
		/*
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i);
			
		}
		
		*/
		
		
		// alle zahlen von 1 bis 100, aber nur jene die durch 3 teilbar sind
		
		for(int i=1; i<=100;i++)
		{
		
			if (i%3==0)
			{
				System.out.println(i);
				
			}
		
		}
		
		// alle zahlen von 1 bis 100, aber nur jene die durch 3 teilbar sind
		// Abbruch, wenn 10. Zahl gefunden
		
		int a=0;

				for(int i=1; i<=100;i++)
				{			
					if (i%3==0)
					{
						System.out.println(i);
						a++;
						
					}
				
					if(a==10)
						break;
				}
				
				
		
				
				
				

	}

}
