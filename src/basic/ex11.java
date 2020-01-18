class ex11
{
	public static void main(String args[])
	{
		//int x=65;
		//System.out.println(x>=60? "¤Î®æ":"¤£¤Î®æ");
		/*if(x>=60)
		{
			System.out.println("¤Î®æ ¼");
		}
		else
		{
			System.out.println("¤£¤Î®æ");
		}*/
		
		
		//String abc="¥¨¦K";
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("¿é¤J·|­ûµ¥¯Å:");
		
		//int member=sc.nextInt();
		//char member='A';
		String member="Level2";
		
		switch(member)
		{
			//case 1:
			//case 'A':
			case "Level1":
				System.out.println("ª÷¥d");
				break;
			//case 2:
			//case 'B':
			case "Level2":
				System.out.println("»È¥d");
				break;
			//case 3:
			//case 'C':
			case "Level3":
				System.out.println("´¶³q·|­û");
				break;
			//case 4:
			//case 'D':
			case "Level4":
				System.out.println("«D·|­û");
				break;
			
			default:
				System.out.println("­«¶ñ¡@¢°¡ã¢³");			
			
			
			
		}
	
	
	
	
	}



}
