                                                  //Object Cloning:
//Refer Javatpoint

//class Program32 
//{
//	int rollno;
//	String name;
//	public static void main(String[] args) 
//	{
//		System.out.println("Object Copying:");
//		System.out.println();
//		Program32 p=new Program32("Ramayya",100);
//		Program32 p1=p;             //Shallow cloning. And it has some drawbags;
//		p1.name="Ajay";              // p.name value also changed;
//		System.out.println("Roll no: "+p.rollno+"  Name is: "+p.name);
//		System.out.println("Roll no: "+p1.rollno+"  Name is: "+p1.name);
//		System.out.println();
//		Program32 p2 =new Program32(p.name,p.rollno);      //Deep Cloning:
//		p2.name="Vinay";              //Only change p2.name value;
//		System.out.println("Roll no: "+p.rollno+"  Name is: "+p.name);
//		System.out.println("Roll no: "+p2.rollno+"  Name is: "+p2.name);	
//		System.out.println();
//	}
//	Program32(String n,int r)
//	{
//		rollno=r;
//		name=n;
//	}	
//}






class Program32 implements Cloneable
{
	int rollno;
	String name;
	public static void main(String args[])
	{
		System.out.println("Object Cloning::");
		try
		{
			Program32 p=new Program32("ramayya",200);
			Program32 p1= (Program32) p.clone();
			Program32 p2=(Program32) p.clone();  //It is deep Cloning:
			p2.name="Krishna";
			System.out.println("Roll no: "+p.rollno+"  Name is: "+p.name);
			System.out.println("Roll no: "+p1.rollno+"  Name is: "+p1.name);
			System.out.println("Roll no: "+p2.rollno+"  Name is: "+p2.name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public  Object clone() throws CloneNotSupportedException  
	{
		return super.clone();
	}
	Program32(String n,int r)
	{
		rollno=r;
		name=n;
	}
}
