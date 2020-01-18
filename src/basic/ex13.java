class ex13
{
	public static void main(String args[])
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("块计");
		int n=sc.nextInt();
		
		System.out.println("块︽计");
		int m=sc.nextInt();
		a:
		for(int x=1;x<=n;x++)//计
		{
			//if(x==9) break;
			for(int y=1;y<=m;y++)//︽计
			{
			
				if(y==8) break;
				if(x==9) break a;
				System.out.print(x+"*"+y+"="+x*y+"\t");
				//System.out.print("*\t");
				
			}
			System.out.println();

		}
		
		
		/*int x1=1;
		
		for(int y=1;y<=9;y++)
		{
			
			System.out.print(x1+"*"+y+"="+x1*y+"\t");
		}
		System.out.println();
		
		
		int x2=2;
		
		for(int y=1;y<=9;y++)
		{
			
			System.out.print(x2+"*"+y+"="+x2*y+"\t");
		}
		System.out.println();
		
		int x3=3;
		
		for(int y=1;y<=9;y++)
		{
			
			System.out.print(x3+"*"+y+"="+x3*y+"\t");
		}
		System.out.println();
		*/
	
	}
}
