package Generic;

public class Example {
	public <E> void  printArray(E []s)
	{
		for(int i = 0; i<s.length;i++)
			System.out.println(s[i]);
		
	}
	public static void main(String args[])
	{
		Example e1= new Example();
		String countries[]= new String[] {"India", "Pakistan","Nepal"};
		Integer numbers[]= {12, 34,56};
		e1.printArray(countries);
		e1.printArray(numbers);
	}
		

}
