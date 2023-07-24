public class Student1{
	char grade;
	int noOfFloors;
	String name;
	float height;
	long usn;

	public Student1()
	{
		System.out.println("Student1 constructor");
	    System.out.println(grade);
		System.out.println(noOfFloors);
	    System.out.println(name);
		System.out.println(height);
		System.out.println(usn);
	}

	public Student1(char grades,int noOfFloorss,String names,float heights,long usns)
	{
		System.out.println("parameterised constructor");
		grade = grades;
		noOfFloors = noOfFloorss;
		name = names;
		height = heights;
		usn = usns;
	}

	public static void main(String[] args){
		new Student1();
		System.out.println("-------------------------");
		Student1 student1 = new Student1('A',8,"Daya",5.2f,95234L);
		System.out.println(student1.grade);
		System.out.println(student1.noOfFloors);
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.usn);
	}
}