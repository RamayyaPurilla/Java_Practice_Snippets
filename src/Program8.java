										//Static Variables and Static Methods;
//1) The static keyword in java is used for memory management. It makes your Program memory efficient [i.e it saves memory].


class Program8 
	{
		int rollno;
		String name;
		static String clg="IIITN";   //College is same for all. so we need not to create memory for all students to store college name,just we use static keyword memory allocates only one time:
		static String city;
	public static void main(String[] args) 	
	{
		System.out.println("Static Variables:: and Static Methods::");
		change();
		Program8 p=new Program8(100,"Ramayya");
		p.display();
		Program8 p1=new Program8(101,"Ajay");
		p1.display();
	}
	Program8(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println("Roll number is:"+rollno);
		System.out.println("Name is: "+name);
		System.out.println("College name is: "+clg);
		System.out.println("City: "+city);
	}
	static void change() //Static methods is used to assign values for static variables and also modify the static variables:
	{
		city="NAGPUR";
	}
}
