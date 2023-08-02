												//CONSTRUCTORS
//class Program6 
//	{
//		int y=100;
//		int u=200;
//		int oiu;
//		static int o=104;
//		static int io=451;
//	public static void main(String[] args) 
//	{
//		int a=121;
//		int b=200;
//		System.out.println("CONSTRUCTORS::");  //Constructors is used to initialize the values for instance variables;
//		Program6 p=new Program6();
//		Program6 p1=new Program6(10);
//		Program6 p2=new Program6(10,20);
//		Program6 p3=new Program6(p.y,p1.u);       //Instance Variables
//		Program6 p4=new Program6(a,b);            //Local variables
//		Program6 p5=new Program6(o,io);           //Static variables
//		System.out.println("Instance variable is:"+p.oiu);
//	}
//	Program6()
//	{ 
//		this(1111,2222);        //this line is used for to executing the Parameterized constructor:
//		oiu=147852;
//		System.out.println("Default Constructor is executed:");
//	}
//	Program6(int x)
//	{
//		this();        //this line is used for to executing the default constructor: 
//		System.out.println("Parameterized Constructor is executed:");
//		System.out.println("Number is:"+x);
//	}
//	Program6(int x,int y)
//	{
//		System.out.println("Parameterized Constructor is executed:");
//		System.out.println("First Number is:"+x);
//		System.out.println("Second Number is:"+y);
//	}
//}


//There is no copy constructor in java.
//There are many ways to copy the values of one object into another in Java. They are:
//
//By constructor
//By assigning the values of one object into another
//By clone() method of Object class


class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student(Student s)
	{
		this.id=s.id;
		this.name=s.name;
	}
	void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);	
	}
	Student()
	{
		
	}
}
//
//class Program6
//{
//	public static void main(String args[])
//	{
//		System.out.println("By Constructor:");
//		Student s=new Student(100,"Ramayya");
//		Student s1=new Student(s);
//		s.display();
//		s1.display();
//	}
//}

class Program6
{
	public static void main(String args[])
	{
		System.out.println("Copying values without constructor:");
		Student s=new Student(111,"Karthik");
		Student s1=new Student();
		s1.id=s.id;
		s1.name=s.name;
		s.display();
		s1.display();
	}
}




