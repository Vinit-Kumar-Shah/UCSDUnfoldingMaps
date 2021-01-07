package MyExamples;

public class Student extends Person
{
	private int ID;
	
	public Student()
	{
		this("Student");
		this.ID = 0000;
		System.out.println("cTOR Student #1");
	}

	public Student(String n)
	{
		super(n);
		System.out.println("cTOR Student #2");
	}
	
	public Student(String n, int i)
	{
		super(n);
		this.ID = i;
		System.out.println("cTOR Student #3");
	}
	public void getStudent()
	{
		System.out.println(this.name);
	}
	public int getID()
	{
		return ID;
	}
	
	public String toString()
	{
		return this.getID() + ":" + super.toString();
	}
	public static void main(String[] args)
	{
		Student s = new Student("Birju Chaurasiya", 786);
		System.out.println(s);
	}

}
