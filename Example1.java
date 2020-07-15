package Generic;

public class Example1 {

	public <E> void printArray(E []s )
	{
		for(E x:s)
			System.out.println(x);
		
	}
	public static void main(String[] args)
	{
		Example1 e1 = new Example1();
		String countries[]= new String[]{"India", "pakistan","Nepal"};
		Integer number[]= {12,38 ,56};
		e1.printArray(countries);
		e1.printArray(number);
		
	}
}
