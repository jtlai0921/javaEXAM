class ex11
{
	public static void main(String args[])
	{
		//int x=65;
		//System.out.println(x>=60? "及格":"不及格");
		/*if(x>=60)
		{
			System.out.println("及格��");
		}
		else
		{
			System.out.println("不及格");
		}*/
		
		
		//String abc="巨匠";
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("輸入會員等級:");
		
		//int member=sc.nextInt();
		//char member='A';
		String member="Level2";
		
		switch(member)
		{
			//case 1:
			//case 'A':
			case "Level1":
				System.out.println("金卡");
				break;
			//case 2:
			//case 'B':
			case "Level2":
				System.out.println("銀卡");
				break;
			//case 3:
			//case 'C':
			case "Level3":
				System.out.println("普通會員");
				break;
			//case 4:
			//case 'D':
			case "Level4":
				System.out.println("非會員");
				break;
			
			default:
				System.out.println("重填　１∼４");			
			
			
			
		}
	
	
	
	
	}



}
