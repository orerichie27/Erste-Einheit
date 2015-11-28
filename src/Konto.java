
public class Konto {

	private String Kontoinhaber;
	private double Kontostand;
	
	public double getKontostand()
	{
		
		return Kontostand;
		
	}
	
	
	public void setInhaber(String newInhaber)
	{
		Kontostand=0;
		Kontoinhaber=newInhaber;
		
		
	}
	
	public void aufbuchen (double Betrag)
	{
		Kontostand += Betrag;
		
	}
	
	
	public void abbuchen (double Betrag)
	{
		
		if (Kontostand >= Betrag)
			Kontostand -= Betrag;
		else
			System.out.println("Nicht genung Geld am Konto!");
		
	}

}
