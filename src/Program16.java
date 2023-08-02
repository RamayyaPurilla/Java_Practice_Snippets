                              //OVERRIDING::
//1) we do overriding only in parent child classes(Inheritance);
//2) Only Instance methods are Overrided;
//3) Static and Final methods are cant be Overridden as they are local to class;



class ramayya
{
	void msg()
	{
		System.out.println("Method from Ramayya Class");   //Instance Method
	}
	void msg1(int a)
	{
		System.out.println("Value of a from Ramayya Class: "+a);
	}
}
class Program16 extends ramayya
{
	public static void main(String[] args) 
	{
		System.out.println("RUN TIME POLYMORPHISM OR DYNAMIC BINDING OR LATE BINDING::");       
		System.out.println("Only Instance Methods are Overridden:");
		Program16 p=new Program16();     //The Program executed by depends on the object:
		p.msg();
		p.msg1(111);
		ramayya r=new Program16();    //Reference is one class and object is another class;
		r.msg();
		r.msg1(4524);
		//Program16 a=new ramayya();            //Invalid Statement
	}
	void msg()
	{
		System.out.println("Method from Program16 Class");   //Instance Method
	}
	void msg1(int a)
	{
		System.out.println("Value of a from Program16 Class: "+a);
	}
}
