                                           //SUPER KEYWORD::
//1) The super keyword is used for accessing parent class instance Methods, Variables and constructors:
//2) The super keyword can be specified either in child class constructors or child class instance methods:
//3) The super keyword can't be specified in child static methods:




//class ajay
//{
//	int b=100;  
//}
//
//class Program19 extends ajay
//{
//	int b=200;
//	public static void main(String[] args) 
//	{
//		System.out.println("Super Keyword in Variables::");
//		Program19 p=new Program19();
//		p.method1(); 
//	}
//	void method1()
//	{
//		int b=300;
//		System.out.println("value is:"+super.b);  //Calls ajay class instance variable.
//		System.out.println("value is:"+b);         //Calls Program19 class local variable.
//		System.out.println("value is:"+this.b);    //Calls Program19 class instance class variable.
//	}
//}





//class ajay       //Parent class
//{
//	void method()
//	{
//		System.out.println("Method from Parent class:");
//	}
//	ajay()
//	{
//		System.out.println("Ajay Constructor:");
//	}
//	
//}
//class Program19 extends ajay         //Child class
//{
//	public static void main(String args[])
//	{
//		System.out.println("Super keyword in Methods::");
//		Program19 p=new Program19();
//		p.method();
//	}
//	void method()
//	{
//		super.method();  //without super keyword we can access the both child and parent class methods but we need two objects to access that methods, so memory is wasted in that time we use super keyword to access two methods with one object::
//		System.out.println("Method from Child class:");
//	}
//	Program19()
//	{
//		super();
//		System.out.println("Program19 Constructor:");
//	}
//}




class ajay
{
	ajay()
	{
		System.out.println("Constructor fron parent class:");
	}
}
class Program19 extends ajay
{
	public static void main(String args[])
	{
		System.out.println("Super keyword in Construcrors::");
		Program19 p=new Program19();
	}
	Program19()
	{
		//super();     //In constructors we need not to mention super keyword, by  default jvm takes super in constructors: 
		System.out.println("Constructor fron child class:");
	}
}



