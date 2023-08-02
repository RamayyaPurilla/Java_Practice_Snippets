											//Encapsulation part 2:
//  Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
//  We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.


class Program26 
{
	public static void main(String[] args)
	{
		System.out.println("Encapsulation is used by providing Security:");   //In encapsualtion private and protected specifiers mostly used;
		System.out.println("Encapsulation is fully depend on access specifiers:");
		Program27 p=new Program27();
		System.out.println("Name1: "+p.name1);
//		System.out.println(p.name);                   //refer Program27
	    System.out.println("Name: "+p.getName());     //refer Program27
        p.setStr("Vijay");	    	
        System.out.println("Str: "+p.getStr());
        p.serStr1();
        System.out.println("Str1: "+p.getStr1());
	}
}




