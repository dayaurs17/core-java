public class Returnfunctions{
 public static void main(String args[])
 { empty();
   byte b=byteValue();
   System.out.println(b);
   int i=integerValue();
   System.out.println(i);
   float f=floatValue();
   System.out.println(f);
   long l=longValue();
   System.out.println(l);
   short sh=shortValue();
   System.out.println(sh);
  double d= doubleValue();
   System.out.println(d);
   boolean bl=booleanValue();
   System.out.println(bl);
   char c=charValue();
   System.out.println(c);
   String s=stringValue();
   System.out.println(s);
   int []ar= arrayValues();
   for(int index=0;index<ar.length;index++)
			{
				System.out.println(ar[index]);
			}
   
 }
   
	public static void empty()
	{
		int a = 10;
	    return ;
	}
	public static int integerValue()
	{
		int a=10;
		int b=20;
		int c=a+b;
	  return c;
	}	  
	public static float floatValue()
	{
		float a=9.8f;
		float b=7.676f;
		float c=a/b;
		return c;
	}
	public static byte byteValue()
	{
		byte a=120;
		byte b=98;
		byte c=(byte)(a-b);
		return c;
    }
	public static long longValue()
	{
		long a=100l;
		long b=5000l;
		long c=a*b;
		return c;
	}
	public static double doubleValue()
	{
		double a=987.76512;
		double b=1289.65423;
		double c=1543.88888;
		double avg=(a+b+c)/3;
		return avg;
	}
	public static char charValue()
	{
		char firstAlphabet='a';
		char lastAlphabet='z';
		return firstAlphabet;
    }
    public static boolean booleanValue()
	{
		int a=10 ;
		int b= 20;
		if(b>a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static short shortValue()
	{
		short adipurushTicketPrice = 300;
		return adipurushTicketPrice;
	}
	
	
	public static String stringValue()
	{
		return "Kannada is My Mother Tongue";
	}
	public static int[] arrayValues()
		{
			int [] tenTable = {10,20,30,40,50,60,70,80,90,100};
			
			return tenTable;
}
}