										//INSTANCE AND STATIC BLOCKS::
//1) If we specify a group of statements within a pair of flower braces without any keyword then it is called as
//   Instance block.The purpose of this block is to initialize instance variables:
//2) If we specify a group of statements within a pair of flower braces without Static keyword then it is called as
//   Static block.The purpose of this block is to initialize static variables:



//class Program20
//{
//	int x=100;
//	int y;
//	static int z;
//	public static void main(String[] args) 
//	{
//		Program20 p=new Program20();
//		System.out.println("Instance and Static Blocks::");
//		System.out.println();
//		System.out.println("Instance variable X is: "+p.x);
//		System.out.println("Instance variable Y is: "+p.y);
//		System.out.println("Static variable Z is: "+z);
//	}
//	{
//		y=200;
//	}
//	static 
//	{
//		z=300;
//	}
//	static
//	{
//		z=400;
//	}
//}





									//Rules of Static and Instance Blocks::
//Order of Blocks Execution is static--->main---->instance----->Constructors;


class Program20
{
	static
	{
		System.out.println("Static Block3");
	}
	
	{
		System.out.println("Instance Block4");
	}
	
	public static void main(String args[]) 
	{
		System.out.println("Hello From Main Block:");
		Program20 p=new Program20();  //we must create object to access instance blocks;
		Program20 p1=new Program20();  //How many objects are created in all times instance blocks are executed:
		Program20 p2=new Program20(10);
	}
	
	Program20()
	{
		System.out.println("Zero Parameterized Constructor::");
	}
	
	Program20(int x)
	{
		System.out.println("Parameterized Constructor::");
	}
	
	static
	{
		System.out.println("Static Block1");
	}
	
	{
		System.out.println("Instance Block3");
	}
	
	static
	{
		System.out.println("Static Block4");  //Blocks follows order, from top to bottom
	}
	
	{
		System.out.println("Instance Block2");
	}
	
	static
	{
		System.out.println("Static Block2");
	}
	
	{
		System.out.println("Instance Block1");
	}
}






