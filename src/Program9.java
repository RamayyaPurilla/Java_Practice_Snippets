									 //Static Variables and Instance Variables:

class Program9 
	{
		int count=0;
		static int count1=0;	
	public static void main(String[] args) 
	{
		Program9 p=new Program9();
		Program9 p1=new Program9();
		Program9 p2=new Program9();
		Program9 p3=new Program9();
		Program9 p4=new Program9();
		Program9 p5=new Program9();
	}
//	Program9()  //In Instance, how many objects are created in all times memory allocates.
//	{
//		count++;
//		System.out.println("Instance Variable::");
//		System.out.println(count);
//	}
	Program9()  //In static, memory allocates only one time and updated the value in that variable.
	{
		count1++;
		System.out.println("Static Variable::");
		System.out.println(count1);
	}
}
