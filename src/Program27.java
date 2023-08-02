                                       //Encapsulation Part 1:
class Program27 
{
	private String str;
	private String str1;
	private String name ="Ramayya";
	String name1="Ramayya Gowd";
    public String getName()        //We must place public specifier in getter and setter methods:
    {
    	System.out.println("Some one is accessing your value:");
    	return name;
    }
    public void setStr(String sr)        //Str is String name:
    {
    	System.out.println("Some one is changing your value:");
    	str=sr;
    }
    public String getStr()                //Str is String name:
    {
    	System.out.println("Some one is accessing your value:");
    	return str;
    }
    public void serStr1()
    {
    	System.out.println("Some one is changing your value:");
    	str1="Krishna";
    }
    public String getStr1()
    {
    	System.out.println("Some one is accessing your value:");
    	return str1;
    }
    public static void main(String args[])
    {
    	System.out.println("ENCAPSULATION::");
    	Program27 p=new Program27();
    	System.out.println("Name: "+p.getName());    
        p.setStr("Vijay");	    	
        System.out.println("Str: "+p.getStr());
        p.serStr1();
        System.out.println("Str1: "+p.getStr1());    
    }
}



// right click + source + find getters and setters option: