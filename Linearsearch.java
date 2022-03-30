/* class Linearsearch
{
		public static void main(String args[])
		{
			
			int arr[]=new int[6];
			 arr[0]=11;
			 arr[1]=22;
			 arr[2]=23;
			 arr[3]=41;
			 arr[4]=53;
			 arr[5]=62;
			 int value=41;
			 boolean b=true;
			 int p=0;
			 for(int i=0;i<arr.length-1;i++)
			 {
				if(arr[i]==value)
				{
					p=i;
				}
				else if(arr[i]!=value)
				{
					b=false;
					//System.out.println("Not found");
				}				
			
			 }
			 if(b==true)
			 {
				System.out.println("The given value is present in array at the position "+p);
			 }
			 else
			 {
					System.out.println("Not found");
			 }	
			 	 
			
		}
} */

class Linearsearch 

{
		static boolean b;
   public static void main(String args[])
   {
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      int value = 10;
		int p=0;
	
      for (int i=0 ;i< size-1; i++)
	  {
        if(array[i]==value)
		 {
			 p=i;
			 b=true;
           
         }
		 //else
		 //{
            //System.out.println("Element not found");
         //}
		 
     }
         if(b)
			 {
				System.out.println("The given value is present in array at the position "+p);
			 }
			 else
			 {
					System.out.println("Not found");
			 }	
}
}