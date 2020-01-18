class ex10
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int x;
		
		System.out.println("請輸入分數");
		
		x=sc.nextInt();
		
		if(x>=91 && x<=100)
		{
			System.out.println("A");
		}
		else if(x>=76 && x<=90)
		{
			System.out.println("B");
		}
		else if(x>=60 && x<=75)
		{
			System.out.println("C");
		}
		else if(x>=0 && x<=59)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("範圍須0~100");
		}
		
		
		
		
		/*int x;
		
		System.out.println("請輸入分數");
		
		x=sc.nextInt();
		if(x>=60) 
		{
			System.out.println("及格 ");
			System.out.println("恭喜你");
		}
		else
		{
			System.out.println("不及格 ");
			System.out.println("再加油");
		}*/
		
		
		
		
		/*int x;
		
		System.out.println("請輸入分數");
		
		x=sc.nextInt();
		
		if(x>=60) 
		{
			System.out.println("及格 ");
			System.out.println("恭喜你");
		}*/
		
		
		
	}
}
