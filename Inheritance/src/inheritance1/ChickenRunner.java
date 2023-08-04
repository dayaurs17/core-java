package inheritance1;

public class ChickenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main in ChickenRunner...");
		
		Chicken chicken = new Chicken(700,"UTARAHALLI");
		chicken.printInfo();
		
		FarmChicken farmchicken = new FarmChicken(700,"UTARAHALLI",8,"chicken farmer");
		farmchicken.printInfo();
		
		Broilerchicken broilerchicken = new Broilerchicken(700,"UTARAHALLI",8,"chicken farmer",false,1);
		broilerchicken.printInfo();
		
	}

}
