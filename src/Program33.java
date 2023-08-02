                                   //SERIALIZATION AND DESERIALIZTION::


//Refer javatpoint....

//object-----> byte stream------>ObjectOutputStream----->writeObject();
//byte stream--------->object------>ObjectInputStream------>readObject();


import java.io.*;
class Employee implements Serializable
{
	String name;
	int id;
	Employee(String n,int i)
	{
		name=n;
		id=i;
	}
}

//class Program33
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Serialization:");  //It is a process of converting the state of an object into a byte stream:
//		Employee e=new Employee("Ramayya",10);
//		try
//		{
//			FileOutputStream f=new FileOutputStream("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program33.txt");
//			ObjectOutputStream o=new ObjectOutputStream(f);
//			o.writeObject(e);
//			o.close();
//			f.close();
//			System.out.println("Success:");
//		}
//		catch(Exception e1)
//		{
//			e1.printStackTrace();
//		}
//	}
//}


  //In real time projects .ser files has been used.
  //It is used to store an object in database.



class Program33
{
	public static void main(String args[])
	{
		System.out.println("DESERIALIZTION:");  //It is a process of converting the byte stream into an new object:
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\91939\\eclipse-workspace\\Java\\src\\Program33.ser");
			ObjectInputStream o=new ObjectInputStream(fin);
			Employee e2=(Employee) o.readObject(); //Casting
			o.close();
			fin.close();
			System.out.println(e2.name);
			System.out.println(e2.id);

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}






