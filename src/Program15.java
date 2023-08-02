														//POLYMORPHISM::
//Its depends on methods signature::
//1) Number of Parameters:
//2) Type of Parameters:
//3) Order of Parameters:



//class Program15 
//{
//	public static void main(String[] args)
//	{
//		System.out.println("COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING::");       
//		System.out.println("Instance Method Overloading::");
//		Program15 p=new Program15();
//		p.add();
//		p.add(10);
//		p.add(10, 20);
//		p.add(10, "Ramayya");
//	}
//	void add()
//	{
//		System.out.println("Zero Parameterized Method");
//	}
//	void add(int a)
//	{
//		System.out.println("One Parameterized Method:");
//	}
//	void add(int a,String b)
//	{
//		System.out.println("Two Parameterized Method with different data Types:");
//	}
//	void add(int a,int b)
//	{
//		System.out.println("Two Parameterized Method with same data Types:");
//	}
//}




class Program15
{
	public static void main(String args[])
	{
		System.out.println("COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING::");       
		System.out.println("Static Method Overloading::");
		Program15 p=new Program15();
		method();
		method(10);
		method(10, 20);
		method(10, "Ramayya");
	}
	static void method()
	{
		System.out.println("Zero Parameterized Method");
	}
	static void method(int a)
	{
    	System.out.println("One Parameterized Method:");
	}
	static void method(int a,String b)
	{
		System.out.println("Two Parameterized Method with different data Types:");
	}
	static void method(int a,int b)
	{
		System.out.println("Two Parameterized Method with same data Types:");
	}
}



//class Program15
//{
//	public static void main(String args[])
//	{
//		System.out.println("COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING::");       
//		System.out.println("Main Method Overloading::");
//	    main(10);
//	    main(3.254);
//	    main("Ramayya");
//		int arr1[]=new int[] {4,5,6};
//		main(arr1);   
//	}
//	public static void main(int a )
//	{
//		System.out.println("Integer is a Parameter:");
//	}
//	public static void main(double d)
//	{
//		System.out.println("Double is a Parameter:");
//	}
//	public static void main(String v)
//	{
//		System.out.println("String is a Parameter:");
//	}
//	public static void main(int a[])
//	{
//		System.out.println("Array is a Parameter:");
//	}
//}




//class Program15
//{
//	public static void main(String args[])
//	{
//		System.out.println("COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING::");       
//		System.out.println("Constructors Overloading::");
//		Program15 p=new Program15();
//		Program15 p1=new Program15(10);
//		Program15 p2=new Program15(10,20);
//		Program15 p3=new Program15(10,"Ramayya");
//	}
//	Program15()
//	{
//		System.out.println("Zero Parameterized Constructor:");
//	}
//	Program15(int a)
//	{
//		System.out.println("One Parameterized Constructor:");
//	}
//	Program15(int a,int b)
//	{
//		System.out.println("Two Parameterized Constructor with same data types:");
//	}
//	Program15(int a,String c)
//	{
//		System.out.println("Two Parameterized Constructor with different data types:");
//	}
//}




