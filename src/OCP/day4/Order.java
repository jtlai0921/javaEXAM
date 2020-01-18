class Order
{
	private String name;
	private int lcd;
	private int ram;
	private int mouse;
	private int sum;
	
	Order(String name,int lcd,int ram,int mouse)
	{
		if(lcd>=0 && ram>=0 && mouse>=0)
		{
			this.name=name;
			this.lcd=lcd;
			this.ram=ram;
			this.mouse=mouse;
			
			sum=lcd*4999+ram*1280+mouse*799;
		
		}
		
	
	
	}
	
	
	void show()
	{
		System.out.println("¦W:"+name+
		"\tlcd:"+lcd+
		"\tram:"+ram+
		"\tmouse:"+mouse+
		"\tsum:"+sum);
	
	}

}
