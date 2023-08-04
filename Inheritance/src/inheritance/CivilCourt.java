package inheritance;

public class CivilCourt extends HighCourt {
	void propertyCase()
	{
		System.out.println("Invoking Property Case from Civil Court");
	}
	 void theftCase()
	{
		System.out.println("Invoking Theft Case from Civil Court");
	}
	@Override
	 void criminalCase()
	{
		System.out.println("Invoking Criminal Case from Civil Court");
	}
	@Override
   void forgeryCase()
	{
		System.out.println("Invoking Forgery Case from Civil Court");
	}
}
