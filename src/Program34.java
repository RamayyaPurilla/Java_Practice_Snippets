                                             //INNER CLASSES::

//The Classes that are declared inside another class are called as inner class or nested class.
//
//
//1) Inner classes have a special type of relationship that it can access all the members of outer class including private:
//2) More readable and maintainable:
//3) Inner classes requires less code:
//4) If a class is useful to only one other class then it is logical  to embed it in that class and keep the two togeather:	

//Regular Inner class:
//Method Local Inner class:
//Annnonymous Inner class:
//Static Inner class:



//class Program34 
//{
//	class Inner
//	{
//		void InnerMethod()  //we have two ways to calling inner class method:
//		{
//			System.out.println("Inner Class Method:");
//		}
//	}
//	void OuterMethod()
//	{
//		System.out.println("Outer Method from main Class:");
//		Inner i=new Inner();     //1st way:
//		i.InnerMethod();
//	}
//	public static void main(String[] args) 
//	{
//		System.out.println("Inner Classes::");
//		System.out.println("Regular Inner Class:");
//		Program34 p=new Program34();
//		p.OuterMethod();
////		Inner i=new Inner();   //Invalid Statement we cant do like this:
//		Program34.Inner i1=new Program34().new Inner();     //2nd way::
//		i1.InnerMethod();
//	}
//}


//class Program34
//{
//	public static void main(String args[])
//	{
//		System.out.println("Method Local Inner class:");
//		Program34 p=new Program34();
//		p.OuterMethod();
//	}
//	void OuterMethod()
//	{
//		class Inner
//		{
//			void InnerMethod()
//			{
//				System.out.println("Inner Class method:");
//			}
//		}
//		Inner i=new Inner();
//		i.InnerMethod();
//		System.out.println("Outer method from Main class:");
//	}
//}




//class parent
//{
//	void method()
//	{
//		System.out.println("Method From Parent Class:");
//	}
//}
//class Program34
//{
//	public static void main(String args[])
//	{
//		System.out.println("Annonymous Inner class:");  //There is no class name for annonyous class:
//		parent p=new parent();
//		p.method();
//		parent p1=new parent()
//		{                                                 //Annonymous Inner Class
//			void method()
//			{
//				System.out.println("Method From Annonymous Class:"); //Refer javatpoint;
//			}
//		};
//		p1.method();
//	}
//}



class Program34
{
	static class Inner
	{
		void method()
		{
			System.out.println("Method from static inner method:");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Static Inner class:");
		Inner i=new Inner();   //Because of inner class is also static so this statement is allowed:
		i.method();
	}
}












