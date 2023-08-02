                                         //File Handling:::    (2nd way)
// Refer javatpoint.


//import java.io.*;
//class Program30 
//{
//	public static void main(String[] args)
//	{
//		System.out.println("File Output Stream::");  //Adding data:
//		try         //Instead of try catch block we use throws exception statements.
//		{
//			FileOutputStream fout = new FileOutputStream("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program30.txt");
//			fout.write(65);
//			fout.write(66);
//			fout.write(67);   // It accepts only int type values:
//			String s=" Ramayya Gowd:";
////			fout.write(s);     //Invalid statement.
//			byte b[]=s.getBytes();    //Converting String to byte
//			fout.write(b);
//			fout.close();
//			System.out.println("Success.");
//		} 
//		catch (Exception e1) 
//		{
//			e1.printStackTrace();
//		}
//	}
//}



//import java.io.*;
//class Program30
//{
//	public static void main(String []args)
//	{
//		try 
//		{
//			FileInputStream fin=new FileInputStream("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program30.txt");
//			int i=fin.read();
//			int j=0;
//			System.out.println(i);
//			System.out.println((char)i);  
//			while((j=fin.read())!=-1)   //Returns: The next byte of data, or -1 if the end of thefile is reached.
//			{
//				System.out.print((char)j);  
//			}
//			fin.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}








