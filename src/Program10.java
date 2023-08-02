      					//Rules for accessing Instance and Static methods and variables :
//1) Instance method vs Instance variables and Instance method.
//2) Instance method vs Static variables and Static method.
//3) Static method vs Instance variables and Instance method.
//4) Static method vs Static variables and Static method.




//class Program10 
//	{
//		int a=100;   //Instance variable
//	public static void main(String[] args) 
//	{
//		System.out.println("Instance method vs Instance variables and Instance method::");
//		System.out.println();
//		System.out.println("An instance method can access instance variables and methods directly they belongs to same class , otherwise they must be accessed only  using reference variable(Object): ");
//		Program10 p=new Program10();
//		p.method2();
//	}
//	void method1()
//	{
//		System.out.println("Method 1:");
//		System.out.println("Instance Variable is:"+a);
//	}
//	void method2()
//	{
//		method1();          //Calling Instance Method:
//		System.out.println("Method 2:");
//		System.out.println("Instance Variable is:"+a);         //Calling Instance Variable
//	}
//}



//class Program10
//{
//	static int a=1001;
//	public static void main(String[] args)
//	{
//		System.out.println("Instance method vs Static variables and Static method::");
//		System.out.println();
//		System.out.println("An instance method can access Static variables and methods directly they belongs to same class , otherwise they must be accessed either by  using class name or by using Object:");
//		Program10 p=new Program10();
//		p.method1();
//	}
//	void method1()    //Instance method;
//	{
//		method2();        //Calling Static method.
//		System.out.println("Method 1::");
//		System.out.println("Static variable: "+a);       //Calling Static Variable.
//	}
//	static void method2()
//	{
//		System.out.println("Method 2::");
//		System.out.println("Static variable: "+a);
//	}
//}


//class Program10
//{
//	int a=2019;
//	public static void main(String[] args)      //Main method is also a static method.
//	{
//		System.out.println("Static method vs Instance variables and Instance method");
//		System.out.println();
//		System.out.println("Static methods can access Instance members only by using reference variable(Object) whether they belongs to same class or not:");
//		Program10 p= new Program10();
//		p.method1();        //Calling Instance Method
//		p.method2();        //Calling Instance Method
//		System.out.println("Instance Variable: "+p.a);     //Calling Instance Variable;
//	}
//	void method1()
//	{
//		System.out.println("Method 1::");
//		System.out.println("Instance variable: "+a);
//	}
//	void method2()
//	{
//		System.out.println("Method 2::");
//	}
//}






//class Program10
//{
//	static int a=2020;
//	public static void main(String[] args)      //main method is also a static method.
//	{
//		System.out.println("Static method vs Static variables and Static method::");
//		System.out.println();
//		System.out.println("Static method can access Static members directly provided they belongs to same class, otherwise they must be accessed either by using class name or by using an object:");
//		method1();
//		System.out.println("Static variable is: "+a);
//	}
//	static void method1()
//	{
//		System.out.println("Method 1::");
//		System.out.println("Static Variable is:"+a);
//	}
//}



