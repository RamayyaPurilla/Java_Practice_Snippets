											//Exception Handling::
// 1) The term exception means exceptional condition, it is a problem that may arise during the execution of program.
// 2) A bunch of things can lead to exceptions, including programmer error, hardware failures, files that need
//    to be opened cant be found, resource exhaustion etc.
// 3) Java Provides a robust and object oriented way to handle exception scenarios, known as Exception Handling.
// 4) when the exception occurs in a method, the process of creating the exception object and handling it over to runtime
//    environment is called "throwing the exceptions".
// 5) Once runtime receives the exception object, it tries to find handler for the exception.Exception handler
//    is the block of code that can process the exception object. The handler is said to be "catching the exception".
// 6) Note that java Exception handling is a frame work that is used to handle run time errors only, compile time
//    errors are not handled by exception handling in java.



                                      //Exception Handling Keywords:::
// 1) The "try" keyword is used to specify a block where we should place exception code. The try block must be followed 
//    by either catch or finally. It means, we cant use try block alone.
// 2) The "catch" block is used to handle the exception. It must be precedded by try block which means we cant 
//    use catch block alone. It can be followed by finally block later.
// 3) The "finally" block is used to execute the important code of the program. It is executed wheather an exception
//    is handled or not.
// 4) The "throw" keyword is used to throw an exception.
// 5) The "throws" keyword is used to declare exceptions. It doesnt throw an exception. It specifies that there 
//    may occur an exception in the method. It is always used with method signature.





// Object is the super most class for all classes in java......







//class Program35 
//{
//	public static void main(String[] args)
//	{
//		int a=10;
//		int b=20;
//		System.out.println(a);
//		System.out.println(b);
////		System.out.println(c);   //Error occured in compilation time.Only User can handle this Exceptions:
//		System.out.println(a/0);  //Error occured in run time. so we have to handle this exceptions:
//		  //In run time complier found an error the program execution will stops.To overcome to this propram we use exception handling:
//		System.out.println("Ramayya Gowd");
//	}
//}







//class Program35
//{
//	public static void main(String args[])
//	{
//		int a=10;
//		int b=20;
//		System.out.println(a);
//		System.out.println(b);
//		try
//		{
//			System.out.println("Value of a is: "+a);
//			System.out.println("Division: "+(a/0));  //One object can be created if complier found run time error.so we pass that object to catch block:
//		}
//		catch(Exception e)  //It accepts one parameter.Exception is main class of all Exception classes like ArithmeticException etc...
//		{
//			System.out.println();
//			e.printStackTrace();   //It is a  predefined method.It prints complete details of error:
//			System.out.println();
//			System.out.println(e.toString());   //To find  the details of error.
//			System.out.println();
//			System.out.println(e.getMessage());  
//			System.out.println();
//			System.out.println("Errors Found in your Program:");
//		}
//		finally
//		{
//			System.out.println("From finally Block::");
//		}
//		System.out.println("Ramayya:");  //Program Executes completely:
//	}
//}






//class Program35
//{
//	public static void main(String args[])
//	{
//		System.out.println("One try block with multiple catch blocks:");
//		try
//		{
//			int arr[]=new int[2];
//			arr[0]=10;
//			arr[1]=20;
//			arr[2]=30;  //First Exception
//			arr[3]=10/0;  //Second Exception.we have 2 exceptions complier goes to the 1st exception and search the catch block for that exception:
//		}
////		catch(Exception e2)  //We cant write this Exception in first catch block:
////		{
////			e2.printStackTrace();
////		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//			System.out.println();
//			System.out.println("Ramayya1");
//		}
//		catch(ArrayIndexOutOfBoundsException e1)
//		{
//			e1.printStackTrace();
//			System.out.println();
//			System.out.println("Ramayya2");
//		}
//		catch(Exception e5)  //If we dont know the exact name of the exception. so we can write like this. Exception is Parent for all exceptions:
//		{
//			e5.printStackTrace();
//			System.out.println();
//			System.out.println("Ramayya3");
//		}
//		finally  //Fianlly block executes only ocnce and we cant create multiple finally blocks:
//		{
//			System.out.println("Finally Block");
//		}
//	}
//}





//class Program35
//{
//	public static void main(String args[])
//	{
//		System.out.println("Nested Try Blocks:");  //More than one exception occured cases:
//		System.out.println("Inner Try and Catch blocks:");
//		try
//		{
//			int arr[]= {10,20};
//			try
//			{
//				arr[2]=30;
//			}
//			catch(Exception e1)
//			{
//				e1.printStackTrace();
//				System.out.println("Ramayya1");
//			}
//			finally
//			{
//				System.out.println("Finally block 1:");
//			}
//			arr[2]=100/0;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Ramayya2");
//		}
//		finally
//		{
//			System.out.println("Finally block 2");
//		}
//	}
//}

// 1) In java throw keyword is used to explicitly throw an exception from a method of any block of code.
// 2) We can throw either checked or unchecked exception in java by throw keyword.
// 3) The throw keyword is mainly used to throw custom exceptions.
// 4) We can define our own set of conditions or rules and throw an exception explicitly using throw keyword.
// 5) For Example, we can throw ArithmeticException when we divide number by 5, or any other number, what we need
//    to do is just set the condition and throw any excepton using throw keyword. 



//class Program35
//{
//	public static void main(String args[])
//	{
//		System.out.println("Using throw keyword:");
//		Program35 p=new Program35();
//		System.out.println();
//		p.validate(45);
//		System.out.println();
//		p.validate(16);
//		System.out.println("Program succesfully Completed:");
//	}
//	void validate(int age)
//	{
//		if(age<18)
//		{
//			throw new ArithmeticException("You are not eligible for vote:");
//		}
//		else
//		{
//			System.out.println("You are eligible for vote:");
//		}
//	}
//}




// 1) In java throws keyword which is used in the signature of method to indicate that this methid might throw 
//    one of the listed type exceptions.
// 2) The caller to these methods has to handle the exception using a try-catch block.
// 3) It is designed to transfer the responsibility of exception handling to its  caller.
// 4) we use throws keyword in checked exceptions(compiler found errors in compilation time )

//Difference btw throws and throw keyword--------------------->Refer javatpoint

class Program35
{
	public static void main(String args[]) 
	{
		System.out.println("Throws Keyword:");
		try 
		{
			display();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception::");
			e.printStackTrace();
		}
		System.out.println("Program Completed:");
	}
	static void display() throws Exception
	{
		System.out.println("Display Method:");
		int a=100/0;
		int arr[]= {10,11};
		arr[5]=100;
		System.out.println("Value of a is: "+a);
	}
}





                                    //User defined Exceptions........
// 1) Create the new exception class extending Exception class.
// 2) Create a public constructor for a new class with string type of parameter. 
// 3) Pass the string parameter to the super class.
// 4) Declare the Exception at the method level.
// 5) Create try catch block inside that create a new exception and throw it based on some condition.
// 6) Write a catch block and use some predefined exceptions.
// 7) Write a optionally finally block.



//  Refer javatpoint.



//import java.util.*;
//class Program35 extends Exception
//{
//	public Program35(String s)
//	{
//		super(s);
//	}
//	public static void main(String args[]) throws Program35
//	{
//		System.out.println("Enter your age:");
//		Scanner sc=new Scanner(System.in);
//		try
//		{
//			int  age=sc.nextInt();
//			if(age<18)
//			{
//				throw new Program35("You are not Eligible for vote:");
//			}
//			else
//			{
//				System.out.println("You are Eligible for vote:");
//			}
//		}
//		catch(Program35 p)
//		{
//			p.printStackTrace();
//		}
//		System.out.println("Program Completed Succesfully::");
//	}
//}



//class Program35
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Ramyya:");
//		try
//		{
//			System.out.println("Vijay:");
//			System.exit(0);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Rama");
//			e.printStackTrace();
//		}
//		finally
//		{
//			System.out.println("Krishna");
//		}
//	}
//}














