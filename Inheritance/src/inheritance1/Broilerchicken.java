package inheritance1;

public class Broilerchicken extends FarmChicken {
 boolean isAlive;
 float weight;
	public Broilerchicken(int price,String location,int noOfDays,String careTaker,boolean isAlive,float weight) {
		super(price,location,noOfDays,careTaker);
		this.isAlive=isAlive;
		this.weight=weight;
		System.out.println("invoking int,string,boolean,float in broilerchicken");
		// TODO Auto-generated constructor stub
	}
	 @Override
	 void printInfo() {
		 System.out.println("running printInfo in BroilerChicken...");
		 super.printInfo();
		 System.out.println(this.isAlive);
		 System.out.println(this.weight);
	 }

}
