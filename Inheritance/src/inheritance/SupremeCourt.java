package inheritance;

public class SupremeCourt extends Court{

	 void importantCase()
	{
		System.out.println("Invoking importantCase from Supreme Court");
	}
	@Override
	 void justice()
	{
	  System.out.println("Invoking Justice Method from SupremeCourt");
	}
}
