package MyExamples;

public class Person 
{
	public String name;
	
	public Person(String n)
	{
		super();
		this.name = n;
		System.out.println("cTOR Person");
	}
	
	public void setname(String n)
	{
		this.name = n;
	}
	
	public String toString()
	{
		return name;
	}

}
