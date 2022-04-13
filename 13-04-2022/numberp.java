


class numberp
{
  public static void main(String args[])
  {
	  
	  
	  
    int n=121,r,s=0;
	
	int i=n;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		s=s*10+r;
		
	}
	if(i==s)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	} 
	
	
	
  }
}