class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        
       for(int r=0,lr=matrix.length-1;r<matrix.length/2;r++,lr--)    
       for(int c=0;c<matrix[0].length;c++){
          int temp = matrix[r][c];
           matrix[r][c]=matrix[lr][c];
           matrix[lr][c]=temp;
       }
    }
}