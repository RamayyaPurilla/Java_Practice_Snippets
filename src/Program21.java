                                		//ABSTRACTION::


// 1) Abstraction is a process of hiding the implementation details from the user.Only the functionality will be provided to the user.
// 2) In java Abstraction is achieved by using abstract classes(0 to 100%) and Interfaces(100%):

										//Absrtact Class::
//1) we can't use abstract and final keyword at a time in classes and methods:
//2) we can't use abstract and static keyword at a time in methods:


// Abstract class in java::
// 1) A class that is declared with using "abstract " keyword is known as Abstract class.
// 2) It can have abstract methods(methods without body) as well as concrete methods (regular methods with body.)
// 3) An abstract class can not be instantiated, which means you are not allowed to create an object of it.
// 4) A class derived from the abstract class must implemented all those methods that are declared as abstract in parent class.
//
//
// Abstract methods in java:::
// 1) Abstract method has no body (no declaration and no definition).
// 2) Always end the declaration with a semicolon(;).
// 3) Itmust be overridden. An abstract class must be extended and in a same way abstract method must be overridden.
// 4) A class has to be declared abstract to have abstract methods.
// 
//
//
// Important Points:::
// 1) An abstract class may also have concrete (complete) methods.
// 2) For design purose, a class can be declared abstract even if it does not contain any abstract methods.
// 3) Reference of an abstract class can point to objects of its sub class thereby achieving run-time polymorphism.
// 4) A class must be compulsorily labeled abstract, if it has one or more abstract methods.
// 5) It can have Constructors and static methods also.
//
//                             Abstract class(Concrete + Abstract methods)
//                                           ^
//                                           |
//                             Abstract method(Only Declarations)
//                                           ^
//                                           |
//                             Concrete Class (Only Concrete Methods)
//                                           ^
//                                           |  
//                             Concrete Method(with body, Definition and Declaration)
//




abstract class janthuvulu     //Abstract class, in this classes we cant create objects.
{
	abstract void sound();      //Abstract method
	abstract void dog();
	static int a=100;    //Static variable:
	int b=200;
	void display()          //Concrete method:
	{
		System.out.println("I am From janthuvulu Class:");
	}
	janthuvulu()
	{
		System.out.println("janthuvulu Constructor::");
	}
	abstract void bank();
	static void vijay()
	{
		System.out.println("Vijay static method:");
	}
}
class Program21 extends janthuvulu
{
	public static void main(String[] args) 
	{
		System.out.println("Abstraction::");
		System.out.println("Abstract Classes:");
		System.out.println();
		Program21 p=new Program21();
		p.sound();
		p.bank();
		p.dog();
		p.display();
		System.out.println("Value of  A is: "+a);  //Static variable:
		System.out.println("Value of  B is: "+p.b);    //Instance variable
		System.out.println();
		janthuvulu j=new Program21();  //we can create reference for abstract class:
		j.display();
		j.bank();
		j.dog();
		j.sound();
		System.out.println();
		ramay r=new ramay();
		r.display();
		r.bank();
		r.dog();
		r.sound();
		//Janthuvulu ja=new janthuvulu();   //we cant create object for abstract class.
		vijay();
	}
	void sound()    //Method overriding
	{
		System.out.println("Sound method from Program21:");
	}
	void dog()
	{
		System.out.println("Barking from Program21 class:");
	}
	Program21()
	{
		System.out.println("Program21 COnstructor::");
	}
	void bank()
	{
		System.out.println("State Bank:");
	}
//	void display()          //Concrete method:
//	{
//		System.out.println("I am From Program21 Class:");
//	}
}

class ramay extends janthuvulu  //Different users has given different functionality to that abstract methods:
{
	void bank()
	{
		System.out.println("HDFC Bank:");
	}
	void sound()
	{
		System.out.println("Sound method from ramay class:");
	}
	void dog()
	{
		System.out.println("Barking from ramay class:");
	}
	public static void main(String args[])
	{
		vijay();
		System.out.println(111111);
		for(int a=1;a<100;a++)
		{
			System.out.println(a);
		}
	}
}
