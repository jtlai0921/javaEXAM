class ex12
{
	public static void main(String args[])
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("¿é¤J¦¸¼Æ");
		
		int n=sc.nextInt();
		
		for(int x=1;x<=n;x++)
		{
			//if(x==121) break;
			//if(x==121) continue;
			
			if(x>=31 && x<=46) continue;
			if(x>=86 && x<=96) continue;
			
			if(x==131) break;
			System.out.println("x="+x+"\thello");
			
		}
		
		/*int x=11;
		while(x<=10)
		{
			
			System.out.println("x="+x+"\thello");
			x++;
		}*/
		
		/*int x=11;
		do
		{
			
			System.out.println("x="+x+"\thello");
			x++;
		}while(x<=10);
		*/
		
		/*System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");*/
	
	}
}
