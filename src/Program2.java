                                          //Buffered Reader
import java.io.*;
class Program2 
	{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st Number:");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Enter 2nd Number:");
		int y=Integer.parseInt(br.readLine());
		System.out.println("Sum is:"+(x+y));
	}
}



//{
//	public static void main(String args[]) throws IOException
//	{
//		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter your name:");
//		String a=bf.readLine();
//		System.out.println("Enter your roll no:");
//		int a1=Integer.parseInt(bf.readLine());
//		System.out.println(a);
//		System.out.println(a1);
//	}
//
//}
