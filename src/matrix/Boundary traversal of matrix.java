class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(n==1){
            for(int i=0;i<m;i++){
                list.add(matrix[0][i]);
            }
        }else if(m==1){
            for(int i=0;i<n;i++){
                list.add(matrix[i][0]);
            }
        }else{
             for(int i=0;i<m;i++){
                list.add(matrix[0][i]);
            }
            for(int j=1;j<n;j++){
                list.add(matrix[j][m-1]);
            }
             for(int k=m-2;k>=0;k--){
                list.add(matrix[n-1][k]);
            }
            for(int s=n-2;s>=1;s--){
                list.add(matrix[s][0]);
            }
             
        }
        
        
        return list;
        
    }
}
