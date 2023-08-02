class Program1 
{
	int r=100;                          //Instance Variable                
    static int p=4513;                   //Static Variable
	public static void main(String[] args) 
	{
		Program1 p1 =new Program1();
		int z=2017;                   //Local Variable
		System.out.println("Hello World");
		int a=100;
		long b=124574;
		char c ='a';
		String d="Ramayya";
		boolean v=true;
		short g=1452;
		byte h=120;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(v);
		System.out.println(g);
		System.out.println(h);
		System.out.println("Local variable is: "+z);
		System.out.println("Instance variable is: "+p1.r);       //we must use object to call instance variable:
		System.out.println("Static variable is: "+p);
		switch(2)
		{
		case 1:System.out.println("Case 1:");
		break;
		case 2:System.out.println("Case 2:");
		break;
		case 3:System.out.println("Case 3:");
		break;
		default:System.out.println("Enter correct Choice:");
		break;
		}
		System.out.println("For loop:");
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);

		}
		System.out.println("While loop:");
		int m=5;
		while(m<10)
		{
			System.out.println(m);
			m++;
		}
		System.out.println("Arrays:");
		int arr[]= {1,2,3};
		int arr1[]=new int[] {4,5,6};
		int arr2[]=new int[3];
		arr2[0]=7;
		arr2[1]=8;
		arr2[2]=9;
		System.out.println("Printing array elements by using for loop:");
		int j,k,l;
//		for(j=0;j<arr.length;j++);
//		{
//			System.out.println(arr[j]);
//		}
//		for(k=0;k<arr1.length;k++);
//		{
//			System.out.println(arr1[k]);
//		}
//		for(l=0;l<arr2.length;l++);
//		{
//			System.out.println(arr2[l]);
//		}
		System.out.println("Printing array elements by using for each loop:");
		for(int wq:arr)
		{
			System.out.println(wq);
		}
		for(int qw:arr1)
		{
			System.out.println(qw);
		}
		for(int y:arr2)
		{
			System.out.println(y);
		}
		System.out.println("Multi Dimentional Arrays:");
		int array[][]= {{11,22,33},{44,55,66},{77,88,99}};
		int array1[][]=new int[2][2];
		array1[0][0]=111;
		array1[0][1]=222;
		int array2[][]=new int [][] {{1111,2222},{3333,44444}};
		System.out.println("Printing multi dimentional array elements by using for each loop:");
		for(int []ty:array)
		{
			for(int yt:ty)
			{
				System.out.print(yt+" ");
			}
			System.out.println();
		}
		for(int []ty:array1)
		{
			for(int yt:ty)
			{
				System.out.print(yt+" ");
			}
			System.out.println();
		}
		for(int []ty:array2)
		{
			for(int yt:ty)
			{
				System.out.print(yt+" ");
			}
			System.out.println();
		}
		System.out.println("Printing multi dimentional array elements by using for loop:");
		for(int ki=0;ki<array.length;ki++)
		{
			for(int ik=0;ik<array.length;ik++)
			{
				System.out.print(array[ki][ik]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("Strings:");        //Strings are immutable:
		String mn="RAmayya_Gowd";               //String data had stored in String Constant Pool;
		String jk=new String("Ajay_Gowd");      //String data had stored in heap memory;
		System.out.println(mn);
		System.out.println(jk);
		System.out.println(mn+" "+jk);
		System.out.println(mn.length());
		System.out.println(mn.charAt(10));
		System.out.println(mn.concat(jk));
		System.out.println(mn.equals(jk));
		System.out.println(mn.equalsIgnoreCase(jk));
		
		
		
		
		System.out.println("String Buffer:");  //String buffer and String builder are pre defined classes and these two classes are mutable;
		StringBuffer iu=new StringBuffer("Learning Java");      //only one way to access String:
		System.out.println(iu);
		System.out.println(iu.length());
		System.out.println(iu.append(" from Youtube"));
		System.out.println(iu.delete(0,9));
		System.out.println(iu.deleteCharAt(10));
		System.out.println(iu.substring(1));     //String Buffer is synchronised object, only 1 thread at a time to access:
		System.out.println(iu.substring(0,5));
		System.out.println(iu.insert(5, " RAM "));
		System.out.println(iu.replace(5,7, " RAMAYYA "));
		System.out.println(iu.reverse());

		
		
		System.out.println("String Builder:");       //String Builder is non-synchronised object, many threads at a time to access:
		StringBuilder nb=new StringBuilder("Learning Python"); //All String buffer methods are also accessble in String Builder:
		System.out.println(nb);
		}
}
