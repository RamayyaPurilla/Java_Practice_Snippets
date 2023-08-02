												//THIS KEYWORD
//1) Using this keyword we can access the instance variables and methods;


class Program7 
	{
		int a=100;
		int c;
	public static void main(String[] args) 
	{
		int a=200;
		Program7 p=new Program7();
		System.out.println("Instance variable: "+p.a);
		System.out.println("Local variable: "+a);
		p.display();
		p.display1(4152);
		System.out.println("Instance variable: "+p.c);   // In line no 27 we must use this keyword , otherwise it prints 0;
	}
	void display()
	{
		int a=321;
		System.out.println("Instance variable: "+this.a);  //Both variables are same this keyword is mandatory:
		System.out.println("Local variable: "+a);
	}
	void display1(int c)   //Both parameter name and variable name is same we must use this keyword; 
	{
		this.c=c;
		System.out.println("C value is: "+c);
	}
}
