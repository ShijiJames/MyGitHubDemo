class SamplethisConst
{
	
	
	public SamplethisConst(int a,int b)
	{
		this("hello");
		System.out.println(a+" "+b);
	}
	public SamplethisConst(String s)
	{
		this();
	System.out.println(s);
	}
	public SamplethisConst()
	{
	System.out.println("default Constructor");
	}
	
	public static void main(String args[])
	{
	SamplethisConst obj=new SamplethisConst(20,30);
	
	
	}
}