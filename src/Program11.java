                                        //INHERITANCE:

//class Employee
//{
//	float salary=10000;
//	String name="Ramayya";
//	Employee()
//	{
//		System.out.println("Employee Constructor Executed");
//	}
//	void display()
//	{
//		System.out.println("Employee name is: "+name);
//		System.out.println("Employee salary is: "+salary);
//	}
//	Employee(int a,String b)
//	{
//		int c=a;
//		String g=b;
//		System.out.println("Employee name is: "+b);
//		System.out.println("Employee salary is: "+a);
//	}
//}
//class Company extends Employee
//{
//	int bonus=2022;
//	Company()
//	{
//		System.out.println("Company Constructor is Executed:");
//	}
//	Company(int a,String b)
//	{
//		int c=a;
//		String g=b;
//		System.out.println("Company name is: "+b);
//		System.out.println("Company salary is: "+a);
//	}
//	void TotalSalary()
//	{
//		System.out.println("Total Salary is: "+(salary+bonus));
//	}
//	
//}
//
//class Program11 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Single level Inheritance::");
//		Company c=new Company();
//		Company c1=new Company(20000,"Ajay");
//		Employee c2=new Employee(2000000,"Ajay_Gowd");
//		c.display();
//		c.TotalSalary();
//	}
//}





//class add
//{
//	int a=100;
//	int b=200;
//	void add()
//	{
//		System.out.println("Addition of two numbers is::"+(a+b));
//	}
//	add()
//	{
//		System.out.println("Addition Constructor is Executed::");
//	}
//}
//class sub extends add
//{
//	void sub()
//	{
//		System.out.println("Subtraction of two numbers is::"+(a-b));
//	}
//	sub()
//	{
//		System.out.println("Substraction Constructor is Executed::");
//	}
//}
//class mul extends sub
//{
//	void mul()
//	{
//		System.out.println("Multiplication of two numbers is::"+(a*b));
//	}
//	mul()
//	{
//		System.out.println("Multiplication Constructor is Executed::");
//	}
//}
//class div extends mul
//{
//	void div()
//	{
//		System.out.println("Division of two numbers is::"+(a/b));
//	}
//	div()
//	{
//		System.out.println("Division Constructor is Executed::");
//	}
//}
//class Program11
//{
//	public static void main(String main[]) 
//	{
//		System.out.println("Multi Level Inheritance::");
//		div d=new div();
//		d.add();
//		d.sub();
//		d.div();
//		d.mul();
//	}
//}



class Animal
{
	void eat()
	{
		System.out.println("Eating:");
	}
	Animal()
	{
		System.out.println("Animal Constructor is Executed:");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking:");
	}
	Dog()
	{
		System.out.println("Dog Constructor is Executed:");
	}
}
class cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing:");
	}
	cat()
	{
		System.out.println("Cat Constructor is Executed:");
	}
}
class Program11
{
	public static void main(String main[]) 
	{
		System.out.println("Hierarchical Inheritance::");
		cat c=new cat();
		c.eat();c.meow();
		Dog d =new Dog();
		d.bark();
		d.eat();
	}
}






