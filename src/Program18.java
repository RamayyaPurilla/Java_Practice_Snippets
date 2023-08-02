                                                //OVERHIDING::
//1) we do overhiding only in parent child classes(Inheritance);
//2) Only Static methods are Overrhided;



class number
{
	static int a=1000;
	static void method1()
	{
		System.out.println("Method one from ramayya class");     //Static method:
	}
	static void num()
	{
		System.out.println("Number from ramayya class "+a);      //Static Number
	}
}
class Program18 extends number
{
	static int a=2000;
	public static void main(String[] args) 
	{
		System.out.println("OVERHIDING::");
		Program18 p=new Program18();
		number n=new Program18();     //The Program executed by depends on the Reference:
		number n1=new number();
		//Program18 p1=new number();         //Invalid Statement::
		p.method1();
		n.method1();
		n1.method1();
		p.num();
		n.num();
		n1.num();
	}
	static void method1()
	{
		System.out.println("Method one from Program18 Class");   //Static Method
	}
	static void num()
	{
		System.out.println("Number from Program18 class "+a);      //Static Number
	}
}
