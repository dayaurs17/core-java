package inheritance;

public class FamilyCourt extends CivilCourt{
	 void divorceCase()
	{
		System.out.println("Invoking Divorce Case from Family Court");
	}
	@Override
	 void propertyCase()
	{
		System.out.println("Invoking Property Case from Family Court");
	}
	@Override
	 void theftCase()
	{
		System.out.println("Invoking Theft Case from Family Court");
	}
}
