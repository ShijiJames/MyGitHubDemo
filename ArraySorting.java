class ArraySorting
{
	public static void main(String args[])
	{
		int matA[][]={{5,4,3},{4,8,6},{2,7,9}};
		int matC[][]=new int[3][3];
		int temp[] = new int[3 * 3];
        int k = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				     for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = mat[i][j];
      
        // sort temp[]
        Arrays.sort(temp);
          
        // copy the elements of temp[]
        // one by one in mat[][]
        k = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = temp[k++];
				
			}
		}
	}
}