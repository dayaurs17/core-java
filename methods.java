public class Methods{
	public static void main(String args[]){
		integers();
		floats();
		chars();
		longs();
		bytes();
		
		
	}
		
		
		
		
		
		public static void integers()
		{
			int []marks = {98,97,96,95,94,90};
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
		}
		public static void floats()
		{
			float []average = {98.2f,97.3f,96.4f,95.12f,94.45f,90.98f};
			for(int i=0;i<average.length;i++)
			{
				System.out.println(average[i]);
			}
		}
		public static void chars()
		{
			char [] vowels = {'a','e','i','o','u'};
			for(int i=0;i<vowels.length;i++)
			{
				System.out.println(vowels[i]);
			}
		}
		public static void longs()
		{
			long [] areaInSqKm = {765489L,98765L,92345L,987621L};
			for(int i=0;i<areaInSqKm.length;i++)
			{
				System.out.println(areaInSqKm[i]);
			}
		}
		public static void bytes()
		{
			byte [] tenTable = {10,20,30,40,50,60,70,80,90,100};
			for(int i=0;i<tenTable.length;i++)
			{
				System.out.println(tenTable[i]);
			}
	
}