
public class Vergleisoperatoren {

	public static void main(String[] args) {

		boolean isCapital1=true,isCapital2=false;
		int inhabitants1=110_000,inhabitants2=300_000;
		double taxPerPersonAndMonth=10_000.0;
		
		System.out.println(isMetropolis(isCapital1, inhabitants1, taxPerPersonAndMonth));
		System.out.println(isMetropolis(isCapital2, inhabitants2, taxPerPersonAndMonth));
		

	}

	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth){
		
		boolean case1, case2;
		
		case1=(isCapital && (inhabitants>100_000));
		case2=((inhabitants>200_000) && ((taxPerPersonAndMonth*inhabitants*12)>720_000_000));
		
		
		return (case1 || case2);
		
		
	}
	
	
	
}
