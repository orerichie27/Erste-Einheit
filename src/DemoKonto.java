
public class DemoKonto {

	public static void main(String[] args) {
	
		Konto Konto1 =new Konto();
		
		Konto1.setInhaber("Franz");
		System.out.println(Konto1.getKontostand());
		
		Konto1.aufbuchen(100.0);
		System.out.println(Konto1.getKontostand());

		Konto1.abbuchen(200.0);
		
		Konto1.abbuchen(50.0);
		System.out.println(Konto1.getKontostand());

		
		
	}

}
