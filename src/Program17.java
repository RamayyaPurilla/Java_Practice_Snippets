                                   //VAR KEYWORD
//1) Var keyword is only works for Local Variables:

class Program17 
{
	int a=100;           //Instance Variable
	static int b=200;    //Static variable
	public static void main(String[] args) 
	{
		var c=10000;
		var ju="Ramayya";                      //No need to mention Particular data type in local variables.
		var nh=true;
		var t=41.25;
		var l='k';
		Program17 p=new Program17();
		System.out.println("Instance variable is: "+p.a);
		System.out.println("Static Variable is: "+b);
		System.out.println("Integer is data type: "+c);
		System.out.println("String is data type: "+ju);
		System.out.println("Boolean is data type: "+nh);
		System.out.println("Double is datatype:  "+t);
		System.out.println("Character is data type: "+l);
	}
}
