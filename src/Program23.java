                           				//ACCESS SPECIFIERS::
//1) The access specifiers can be used to define the level of accessibility of either the members in the class/interface
//   or the level of accessibility of a class/interface in a package.
//2) Using the access specifiers we can define the scope of a class/interface or its members and provide security.
//3) The java language provides 4 levels of access specifiers with three keywords.


//Public::
	// Class, Interface, Variables, Methods and Constructors;
//Protected::
	//Variables, Methods and Constructors;
//Private::
	//Variables, Methods and Constructors;
//Default or Package Level Access Specifier::
	// Class, Interface, Variables, Methods and Constructors;


//Order is::  Public > Protected > Default > Private.
//            Private < Default < Protected < Public.

class Program23 
{
	public static void main(String[] args) 
	{
		System.out.println("Access Specifiers::");
		Program23 p=new Program23();
	}
	public Program23()
	{
		System.out.println("Constructor:");
	}
}
