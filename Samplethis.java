class Samplethis
{
	int a,b;
	public void add()
	{
		this.sub();
		int c= a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int c= b-a;
		System.out.println(c);
	}
	public Samplethis(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public static void main(String args[])
	{
	Samplethis obj=new Samplethis(20,30);
	obj.add();
	
	}
}