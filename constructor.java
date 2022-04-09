 class First
 {
    int id;
	String name;
	
 
   public First(int i,String n)
    {
	   id =i;
	   name = n;
	   
    }
   
	void display()
	{
	 System.out.println(id+" "+name+" ");
	}
	
	
	
	public static void main(String args[])
	{
	    First f=new First(2,"hello");
		f.display();
		
	}
}	