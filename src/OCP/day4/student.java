
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
			
			//System.out.println("新增一位學生");
			
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
		System.out.println("名:"+name+"\t國文:"+chi+"\t英文:"+eng+"\t總分:"+sum+"\t平均 :"+ave);
	}


}
	    

