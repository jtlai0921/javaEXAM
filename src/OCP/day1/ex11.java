package OCP.day1;

class ex11
{
	public static void main(String args[])
	{
		//int x=65;
		//System.out.println(x>=60? "�ή�":"���ή�");
		/*if(x>=60)
		{
			System.out.println("�ή格");
		}
		else
		{
			System.out.println("���ή�");
		}*/
		
		
		//String abc="���K";
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("��J�|������:");
		
		//int member=sc.nextInt();
		//char member='A';
		String member="Level2";
		
		switch(member)
		{
			//case 1:
			//case 'A':
			case "Level1":
				System.out.println("���d");
				break;
			//case 2:
			//case 'B':
			case "Level2":
				System.out.println("�ȥd");
				break;
			//case 3:
			//case 'C':
			case "Level3":
				System.out.println("���q�|��");
				break;
			//case 4:
			//case 'D':
			case "Level4":
				System.out.println("�D�|��");
				break;
			
			default:
				System.out.println("����@���㢳");			
			
			
			
		}
	
	
	
	
	}



}
