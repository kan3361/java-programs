class Child
{
   public static int addMethod(int x,int y)
   {
    System.out.println(x + y);
	return x + y;
	
   }
}
class Child1 extends Child
{
	
	public static double subMethod(double x,double y)
	{
		System.out.println(x - y);
		return x - y;
	}
}
class Child2 extends Child1
{
	public static int multiMethod(int x,int y)
	{
		System.out.println(x * y);
		return x * y;
    }
}
class Child3 extends Child2
{
	public static double divMethod(double x, double y)
	{
		System.out.println(x / y);
		return x / y;
	}
	    public static void main(String args[])
	    {
		    Child c1=new Child();
			Child1 c2=new Child1();
			Child2 c3=new Child2();
			Child3 c4=new Child3();
			c1.addMethod(200,500);
			c2.subMethod(21.4,43.6);
			c3.multiMethod(45,55);
			c4.divMethod(12.43,13.45);
			
	    }
}
