class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][])
    {
        // code here 
        
        for(int i=0,j=matrix[0].length-1,r=0;r<matrix.length;r++){
            int temp = matrix[r][j];
            matrix[r][j]=matrix[r][i];
            matrix[r][i]=temp;
         }
        
    }
}


Input:
n1 = 2, m1 = 3
matrix[][] = {{4, 3, 2},
              {1, 5, 6}}
Output: 2 3 4 6 5 1