                                     //Type Casting:
// Refer javatpoint.


//class Program31 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Type Casting:");
//		System.out.println("Based on Primitive data types:");
//		int a=10;
//		double b=a;          //widening:
//		double c=100.364;
////		int d=c;          // Type mismatch: cannot convert from double to int.
//		int d=(int)c;          //Using narrowing 
//		System.out.println("Integer: "+a);
//		System.out.println("Double: "+b);
//		System.out.println("Double: "+c);
//		System.out.println("Integer: "+d);
//		int x=67;       //67=C;
//		char xv=(char) x;
//		int sdf=82;
//		char asd=(char)sdf;
//		System.out.println("Integer: "+x);
//		System.out.println("Character: "+xv);
//		System.out.println("Integer: "+sdf);
//		System.out.println("Character: "+asd);
//	}
//}


class parent
{
	void parent()
	{
		System.out.println("Parent method:");
	}
	void method()
	{
		System.out.println("Parent class method:");
	}
}
class child extends parent
{
	void child()
	{
		System.out.println("Child method:");
	}
	void method()
	{
		System.out.println("Child class method:");
	}
}
class Program31
{
	public static void main(String args[])	
	{
		System.out.println("Based on Refernce variable::");     //Based on Refernce variable we must use inheritance:
		System.out.println();
		parent p=new parent();
		p.parent();
		p.method();
		System.out.println();
		child c=new child();
		c.child();
		c.method();
		c.parent();
		System.out.println();
		parent p1=(parent) new child();      //Parent Reference and child object:
		parent p4= new child();        //p1 and p4 both statements are correct:
		System.out.println("Up Casting:");
		p1.parent();
		p1.method();
//		p1.child();      //Invalid
		p4.parent();
		p4.method();
		System.out.println();
		parent p2=(parent) new child();         //we cant achieve downcasting directly.we use some process.
	    child c1=(child) p2;
		System.out.println("Down Casting:");
		c1.method();
		c1.parent();
		c1.child();		
	}
}


