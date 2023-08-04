package inheritance;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Court court =new Court();
		court.justice();
		
		SupremeCourt supremecourt =new SupremeCourt();
		supremecourt.justice();
		supremecourt.importantCase();
		
		HighCourt highcourt = new HighCourt();
		//highcourt.justice();
		highcourt.importantCase();
		highcourt.criminalCase();
		highcourt.forgeryCase();
		
		CivilCourt civilcourt = new CivilCourt();
		//civilcourt.justice();
		//civilcourt.importantCase();
		civilcourt.criminalCase();
		civilcourt.forgeryCase();
		civilcourt.propertyCase();
		civilcourt.theftCase();
		
		FamilyCourt familycourt = new FamilyCourt();
		//familycourt.justice();
		//familycourt.importantCase();
		familycourt.criminalCase();
		familycourt.forgeryCase();
		familycourt.propertyCase();
		familycourt.theftCase();
		familycourt.divorceCase();
		
		

	}

}
