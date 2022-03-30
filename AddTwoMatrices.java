class AddTwoMatrices
{
	public static void main(String args[])
	{
		int matA[][]={{1,2,3},{4,5,6},{7,8,9}};
		int matB[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		int matC[][]=new int[3][3];
		System.out.println("Sum of MatA  ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matA[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of MatB  ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matB[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matC[i][j] = matA[i][j] + matB[i][j];
				
			}
		}
		System.out.println("Sum of MatA And MatB  ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matC[i][j]+" ");
			}
			System.out.println();
		}
	}
}