
public class Eins {

	public static void main(String[] args) {

		/*
		boolean treeFront = true;
		int numberLeaves =0;
		char meinZeichen = 'X';
		
		
		
		System.out.println("Ist ein Baum voraus? "+treeFront);
		System.out.println();
		System.out.println("anzahl der Blätter: "+meinZeichen);
		System.out.println("anzahl der Blätter: "+numberLeaves);
		
		*/
		double Fahrenheit=0.0, celsius=30.0;
		
		
		Fahrenheit= celsius2fahrenheit(celsius);
		
		System.out.println(Fahrenheit);
		
		
	}
	
		public static double celsius2fahrenheit(double celsius){
			

			
			return ((9.0/5.0)*celsius+32);
			
		}
		
		
		
		
		
	

}
