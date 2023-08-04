import java.util.*;
import java.io.*;
import java.lang.*;
public class passfail {
	int m;
	public void Getgrade(int mark)
	{
		mark=m;
	}
	public void Gradecheck(int mark)
	{
		if(mark>=50)
		{
			System.out.println("PASS");
		}
		else
			System.out.println("Fail");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
passfail grade=new passfail();
grade.Gradecheck(22);
System.out.println("DONE");
	}

}
