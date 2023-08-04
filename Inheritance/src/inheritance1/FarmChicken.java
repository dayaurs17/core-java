package inheritance1;

public class FarmChicken extends Chicken{
 int noOfDays;
 String careTaker;
 public FarmChicken(int price,String location,int noOfDays,String careTaker) {
	 super(price,location);
	 this.noOfDays =noOfDays;
	 this.careTaker=careTaker;
	 System.out.println("invoking int,string in FarmChicken");
 }
 @Override
 void printInfo() {
	 System.out.println("running printInfo in FarmChicken...");
	 super.printInfo();
	 System.out.println(this.noOfDays);
	 System.out.println(this.careTaker);
 }

}
