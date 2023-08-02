								 //Scanner.
import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Roll Number:");
		int roll=sc.nextInt();
		System.out.println("Enter Your Name:");
	    String name=sc.next();
	    System.out.println("Enter Your Fee:");
		double fee=sc.nextDouble();
		System.out.println("Roll Number is : "+roll);
		System.out.println("Name is:"+name);
		System.out.println("Fee is:"+fee);
		sc.close();
	}
}




