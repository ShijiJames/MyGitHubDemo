public class StringBufferExamples {

	public static void main(String[] args)
	{
		StringBuffer  obj=new StringBuffer("Ryanworld");
		//append
		obj.append("2022");
		System.out.println(obj);
		
		//insert
		obj.insert(4,"J");
		System.out.println(obj);
		
		//delete
		obj.delete(4,5);
		System.out.println(obj);
		
		
		//replace
		obj.replace(4,5,"JW");
		System.out.println(obj);
				
		//reverse
		obj.reverse();
		System.out.println(obj);
	}

}