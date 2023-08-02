                                                //ENUM::
// It is a special class that represents a group of constants:
// Refer javatpoint:

enum level
{
	Low,High,Medium;    //by default it is present in public, static and final;
	                   // In enum class we can create instance variables, instance methods and Constructors:
	level()
	{
		System.out.println("Level Constructor:");
	}
	int a=100;
	void display()
	{
		System.out.println("Instance method:");
	}
}
class Program28 
{
	public static void main(String[] args) 
	{
		System.out.println("Enum:");
		level var =level.Medium;
		level var1=level.High;
		level var2=level.Low;
		System.out.println(var2);
		System.out.println(var2.ordinal());
		System.out.println(var);
		System.out.println(var1);
		System.out.println(level.valueOf("Low"));
		System.out.println("Using For Loop::");
		for(level v:level.values())
		{
			System.out.println(v);
		}
		Program28 p=new Program28();
		System.out.println();
		
	}
}
