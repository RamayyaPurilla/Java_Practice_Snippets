                                           //FINAL KEYWORD::
//1) When a variable is declared with final keyword, its value cant be modified ,essentially, a constant;
//2) Final is a keyword which can be applied to variables,methods and classes;
//3) When a class is declared with final keyword, it is called a final class. A final class cant be extended(Inherited) ;
//4) When a method is decleared with final keyword, it is called a final method.A final method cant be overridden;



//class Program14 
//{
//	public static void main(String[] args) 
//	{
//		final int a=100;      //Final Variable
//		System.out.println("Final Keyword::");
//		System.out.println("Variables with final keyword:");
//		System.out.println("Local Variable: "+a);
//		//a=a+4;
//		System.out.println("Local Variable: "+a);
//	}
//}






//class ramayya
//{
//	final void display()  //Final Method
//	{
//		System.out.println("Method From Ramayya class::"); //run this Program by removing the final keyword in method:
//	}
//}
//class Program14 extends ramayya
//{
//	public static void main(String args[])
//		{
//		System.out.println("Final Keyword::");  
//		System.out.println("Methods with final keyword:");
//		Program14 p=new Program14();
//		p.display();
//	}
//	void display()
//	{
//		System.out.println("Method from Program14 Class::");
//	}
//}






//final class ramayya     //Final Class
//{
//	ramayya()                 //run this Program by removing the final keyword in class:
//	{
//		System.out.println("Ramayya class Constructor:");
//	}
//}
//class Program14 extends ramayya
//{
//	public static void main(String args[])
//	{
//		System.out.println("Final Keyword::");  
//    	System.out.println("Classes with final keyword:");
//    	Program14 p=new Program14();		
//	}
//	Program14()
//	{
//		System.out.println("Program14 Class Constructor::");
//	}
//}






