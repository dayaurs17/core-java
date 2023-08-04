public class Constructer5{
	 public Constructer5(){
		 
		System.out.println("Invoking default Constructer");
	}
	 public Constructer5(int num,String veg)
	{    this();
		System.out.println("Invoking 2parameter constructer");
		
	}
	 public Constructer5(int num,String veg,char alph)
	{  this(5,"batman");
	
		//this.num=num;
		//this.batman=batman;
		//this.alph=alph;
		System.out.println("Invoking 3parameter constructer");
	}
	public Constructer5(int num,String veg,char alph,boolean IsAAlphabet)
	{
		this(45,"superman",'A');
		
		//this.IsAAlphabet=true;
		System.out.println("Invoking 4parameter constructer");
	}
	public Constructer5(int num,String veg,char alph,boolean IsAAlphabet,long no)
	{
		this(55,"IronMan",'B',true);
		System.out.println("Invoking 5parameter constructer");
		//this.no=no;	
	}
	public static void main(String args[])
		{   new Constructer5();
			Constructer5 con=new Constructer5();
			Constructer5 con2=new Constructer5(5,"batman");
			Constructer5 con3=new Constructer5(45,"superman",'A');
			Constructer5 con4=new Constructer5(55,"IronMan",'B',true);
			Constructer5 con5=new Constructer5(55,"IronMan",'B',true,999l);
		}
}		