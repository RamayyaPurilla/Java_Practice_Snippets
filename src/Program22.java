                                          //ABSTRACTION::

											//INTERFACES::
//Interfaces in java::
//1) An interface is a collection of Abstract methods.
//2) An interface can contain both variables and methods.
//3) An interface can not be instantiated.
//4) In order to access the members of interface we need to inherit the interface into a class using implements keyword.                                        
//5) In the sub class we have to override all the abstract methods.
//6) In the sub class is overrigding all the methods of an interface then it is called as Implementation class.
//7) A class can implement any number of Intrfaces.    
// 8) In interfaces we use multiple Inheritance. Because of in interfaces we give only method signature, we does not give method definition so ambiguity doesnt occured. 
                                          
                                          
interface NTR
{
	int x=100;   //All variables in Interface classes are present in by default with final keyord:
	public static final int y=200;   //By Default
	void method1();   //Both public and abstract keywords are present in by default in interface classes:
	public abstract void method2();   //Abstract Method
	void bank();
	static void method6()
	{
		System.out.println("Method6 from NTR Interface is static:");
	}
}
interface interfaceDemo   //One class implements more than one interface:
{
	void method3();
	default void method5()   //If we forgot to override this method, the default method definition is executed:
	{
		System.out.println("Method5 from Default:");
	}
}
interface inter extends NTR
{
	void method4();
}


class Program22 implements NTR
{
	public static void main(String[] args) 
	{
		System.out.println("Abstraction::");
		System.out.println("Interfaces:");
		System.out.println();
		Program22 p=new Program22();
		p.method1();
		p.method2();
		p.bank();
//		x=x+5;    //We cant change the value, because it is a final variable:
		System.out.println("Value of X is:"+x);  //It is a Static Variable
		System.out.println("Value of Y is:"+y);
		System.out.println();
		kaja n=new kaja();
		n.method1();
		n.method2();
		n.bank();
		System.out.println();
		rama r=new rama();
		r.method1();
		r.method2();
		r.bank();
		r.method3();
		r.method5();
		System.out.println();
		NTR n1=new Program22();   //we can create reference for Interface class:
		n1.method1();
		n1.method2();
		n1.bank();
		System.out.println();
		jaggu j=new jaggu();
		j.method1();
		j.method2();
		j.method3();
		j.method4();
		j.bank();
		NTR.method6();  //we must use interface name to access static method:
		NTR.method6();
	}
	public void method1()   //We must use public access specifier to override that abstract method:
	{
		System.out.println("Method1 from Program22 class:");
	}
	public void method2()
	{
		System.out.println("Method2 from Program22 class:");
	}
	public void bank()
	{
		System.out.println("State Bank:");
	}
}


class kaja implements NTR  //Different users has given different functionality to that abstract methods:
{ 
	public void method1()
	{
		System.out.println("Method1 from kaja Class:");
	}
	public void method2()
	{
		System.out.println("Method2 from kaja Class:");
	}
	public void bank()
	{
		System.out.println("HDFC Bank:");
	}
}


class rama implements NTR,interfaceDemo //Different users has given different functionality to that abstract methods:
{
	public void method1()
	{
		System.out.println("Method1 from rama Class:");
	}
	public void method2()
	{
		System.out.println("Method2 from rama Class:");
	}
	public void bank()
	{
		System.out.println("IFC Bank:");
	}
	public void method3()
	{
		System.out.println("Method3 from rama Class:");
	}
	public void method5()
	{
		System.out.println("Method5 from rama Class:");
	}
}	



class jaggu implements inter
{ 
	public void method3()      //Method3 is Optional because this method is not there in (NTR and inter) Interfaces:
	{
		System.out.println("Method3 from jaggu Class:");
	}
	public void method1()
	{
		System.out.println("Method1 from jaggu Class:");
	}
	public void method2()
	{
		System.out.println("Method2 from jaggu Class:");
	}
	public void bank()
	{
		System.out.println("Andhra Bank:");
	}
	public void method4()
	{
		System.out.println("Method4 from jaggu Class:");
	}
}
