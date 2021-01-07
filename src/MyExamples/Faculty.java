package MyExamples;

public class Faculty extends Person
{
private int Salary;
	
	public Faculty()
	{
		this("Faculty");
		this.Salary = 0000;
		System.out.println("cTOR Faculty #1");
	}

	public Faculty(String n)
	{
		super(n);
		System.out.println("cTOR Faculty #2");
	}
	
	public Faculty(String n, int i)
	{
		super(n);
		this.Salary = i;
		System.out.println("cTOR Faculty #3");
	}
	public void getFaculty()
	{
		System.out.println(this.name);
	}
	public int getSalary()
	{
		return Salary;
	}
	
	public String toString()
	{
		return this.getSalary() + ":" + super.toString();
	}
	
	public static void main(String[] args)
	{
		Person p[] = new Person[3];
		p[0] = new Person("Champak");
		p[1] = new Student("Chandu", 202);
		p[2] = new Faculty("Chanda", 500);
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i]);
		}
		
	}

}
