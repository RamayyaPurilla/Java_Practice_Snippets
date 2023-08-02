                                            //Methods:

//class Program5 
//	{
//	public static void main(String[] args) 
//	{
//		System.out.println("Methods::");
//		Program5 p=new Program5();
//		p.method();
//		int result=p.method1();
//		System.out.println("Addition of two numbers is: "+result);
//		p.method2(1000,2000);
//		int result1=p.method3(1111, 2222);
//		System.out.println("Addition of two numbers is: "+result1);
//	}
//	void method()
//	{
//		System.out.println("without parameters and without returm value:");
//		int a=200;
//		int b=300;
//		int c=a+b;
//		System.out.println("Addition of two numbers is: "+c );
//	}
//	int method1()
//	{
//		System.out.println("without parameters and with returm value:");
//		int a=500;
//		int b=300;
//		int c=a+b;
//		return c;
//	}
//    void method2(int x,int y)
//	{
//		System.out.println("with parameters and without returm value:");
//		int a=x;
//		int b=y;
//		int c=a+b;
//		System.out.println("Addition of two numbers is: "+c );
//	}
//    int method3(int x,int y)
//	{
//		System.out.println("with parameters and with returm value:");
//		int a=x;
//		int b=y;
//		int c=a+b;
//		return c;
//	}
//}








											//RECURSION
//class Program5
//{
//	public static void main(String args[])
//	{
//		System.out.println("Factorial of a number:");
//		Program5 p=new Program5();
//		int result=p.fact(5);
//	    System.out.println("Factorial of anumber is:"+result);
//	}
//	int fact(int x)
//	{
//		if(x==0)
//		{
//			return 1;
//		}
//		else
//		{
//			return x*fact(x-1);
//		}
//	}
//}



							//Passing Array as a Parameter in methods: 
//class Program5
//{
//	public static void main(String args[])
//	{
//		System.out.println("Passing array as a parameter in methods:");
//		int arr[]=new int[] {10,20,30,40};
//		System.out.println("Printing array elements without using methods:");
//		for(int t:arr)
//		{
//			System.out.print(t+" ");
//		}
//		Program5 p=new Program5();
//		p.method(arr);	
//	}
//	void method(int x[])
//	{
//		System.out.println();
//		System.out.println("Printing array elements by using method:");
//		for(int v:x)
//		{
//			System.out.print(v+" ");
//		}
//	}
//}





							           //Passing Object as a Parameter in methods:
class subClass            // we have more than one class to pass object as a parameter 
{
	int rollno=100;
	String name="Ramayya";
	String branch="Cse";
}
class subClass1
{
	int tel=60;
	int hin=98;
	int eng=85;
	int mat=85;
}
class subClass2
{
	String col="IIITN";
}
class Program5
{
	public static void main(String args[])
	{
		int marks=654;
		System.out.println("Passing Object as a Parameter in methods::");
		subClass s= new subClass();   //to call the Sub Class. so, we want to create a object for sub class. 
		subClass1 s1=new subClass1();
		subClass2 s2=new subClass2();
		Program5 p=new Program5();
		p.display(s);        //parameter name must same as object name of sub class;
		p.display2(s2);
		p.display1(s1);
		System.out.println("Marks is:"+marks);
	}
	void display(subClass s)
	{
		System.out.println("Roll Number is:"+s.rollno);
		System.out.println("Name is:"+s.name);
		System.out.println("Branch is:"+s.branch);
	}
	void display1(subClass1 s1)
	{
		int Total=s1.tel+s1.eng+s1.hin+s1.mat;
		System.out.println("Total marks is:"+Total);
	}
	void display2(subClass2 s)
	{
		System.out.println("College name is: "+s.col);
	}
}










