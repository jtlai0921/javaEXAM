
class student
{
	private String name;
	private int chi;
	private int eng;
	private int sum;
	private double ave;
	private boolean x;
	
	student(int chi)//int chi=?
	{
			this.chi=chi;
			
			//System.out.println("�s�W�@��ǥ�");
			
		//int chi=60;	
	}
	
	student(String name,int chi,int eng)
	{
		this.name=name;
		this.chi=chi;
		this.eng=eng;
	}
	student(String name,int chi)
	{
	}
	student(int chi,String name)
	{
	}
	
	student(int chi,int eng)
	{
	}
	
	void show()
	{
		System.out.println("�W:"+name+"\t���:"+chi+"\t�^��:"+eng+"\t�`��:"+sum+"\t���� :"+ave);
	}


}
	    

