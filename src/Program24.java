                                         //WRAPPER CLASSES::
// 1)The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
// 2)Autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.



//Primitive Type	 Wrapper class
//boolean	         Boolean
//char	             Character
//byte	        	 Byte
//short	        	 Short
//int	             Integer
//long	        	 Long
//float	        	 Float
//double	         Double



class Program24
{
	public static void main(String[] args) 
	{
		System.out.println("Wrapper Class::");
		int x=20;              //Premitive data type;
		Integer y=x;           //Converting data type to Object;    //AUTO BOXING;
		Integer y1=Integer.valueOf(x);
		System.out.println("Data Type: "+x);
		System.out.println("Object: "+y);
		System.out.println("Object: "+y1);
		Integer a=new Integer(30);    //Integer is a class name:
		int i=a.intValue();           //converting Integer to int explicitly  
		int j=a;                       //unboxing, now compiler will write a.intValue() internally 
		System.out.println("I="+i);
		System.out.println("J="+j);
		Double as=new Double(125.364);
		double asd=as;
		System.out.println(asd);
		System.out.println(as);
	}
}
