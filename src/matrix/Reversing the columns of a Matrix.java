
class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][])
    {
      for(int i=0;i<matrix.length;i++){
          for(int c=0,lc=matrix[0].length-1;c<matrix[0].length/2;c++,lc--){
              int temp=matrix[i][c];
              matrix[i][c]=matrix[i][lc];
              matrix[i][lc]=temp;
          }
      }  
        
      
    }
}
