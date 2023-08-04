package inheritance;

public class HighCourt extends SupremeCourt{

    void criminalCase()
	{
		System.out.println("Invoking Criminal Case from High Court");
	}
	 void forgeryCase()
	{
		System.out.println("Invoking Forgery Case from High Court");
	}
	@Override
	 void importantCase()
		{
			System.out.println("Invoking importantCase from High Court");
		}
}
