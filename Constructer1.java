public class Constructer1{
	int num;
	String veg;
	char alph;
	
	 public Constructer1(){
		System.out.println("Invoking default Constructer");
	}
	 public Constructer1(int num,String veg)
	{
		this.num=num;
		this.veg=veg;
		
		
	}
	 public Constructer1(int num,String veg,char alph)
	{
		this.num=num;
		this.veg=veg;
		this.alph=alph;
	}
	
	
		public static void main(String args[])
		{
			Constructer1 con=new Constructer1();
			con.num=33;
			con.veg="Something";
			con.alph='b';
			Constructer1 con2=new Constructer1(37,"Beans");
			Constructer1 con3=new Constructer1(99,"Brinjal",'a');
		}
}		