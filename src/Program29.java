                                      //Files in JAVA::  (1st way)

// Refer javatpoint:::: 
//createNewFile();    ----> creating new file.
//delete();           ----->for deleting.
//exists;             ----->for checking if that file is present in that location or not.
//getName;            ----->Printing file name
//getAbsolutePath();  ----->to find exact path.
//length();           ----->to find the size.
//list();             ----->by using to all lists in that folder
//mkdir();            ----->to create a directory.
//canRead();          ----->for reading purpose.
//canWrite();         ----->for writing purpose.

// These all methods are present in File class.
// In files we use Exception handling is better to avoid errors.


//import java.io.*;
//class Program29 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Creating a new File::");
//		try
//		{
//			File f=new File("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program29.txt");
//			if(f.createNewFile())     // It returns boolean value.
//			{
//				System.out.println("File is Created:");
//			}
//			else
//			{
//				System.out.println("The file is already exixts:");
//			}	
//		}
//		catch(Exception e)
//		{
//			System.out.println("An error is Occured:");
//			e.printStackTrace();
//		}
//	}
//}



//import java.io.*;
//class Program29
//{
//	public static void main(String args[])
//	{
//		System.out.println("Methods in Files:");
//		File f=new File("C:\\Users\\\\91939\\eclipse-workspace\\Java\\src\\Program29.txt");
//		if(f.exists())       // It check the file is present or not in that above location.
//		{
//			System.out.println(f.getName());
//			System.out.println(f.getAbsolutePath());
//			System.out.println(f.length());
//			System.out.println(f.canRead());
//			System.out.println(f.canWrite());
//			System.out.println(f.canExecute());
//		}
//		else
//		{
//			System.out.println("File doesnot exists:");
//		}
//	}
//}







//import java.io.*;
//class Program29
//{
//	public static void main(String args[])
//	{
//		System.out.println("Adding data in Files:");
//		try 
//		{
//			FileWriter fw=new FileWriter("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program29.txt");  //This FileWriter class is useful to add data in txt file:
//			fw.write("Ramayya Gowd a big fan of NTR.......");
//			fw.close();        //we must close the file:
//			System.out.println("Succesfully Updated:");
//		}
//		catch(IOException e)
//		{
//			System.out.println("Exception caught:");
//			e.printStackTrace();
//		}
//	}
//}






import java.io.*;
import java.util.Scanner;
class Program29
{
	public static void main(String args[]) 
	{
		System.out.println("Reading data from files:");
		try 
		{
			File f=new File("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program29.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())          //It is also returns boolean value:  hasNextLine check next line is empty or not:
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}







