package array.matrix;

import java.util.ArrayList;

class MatrixSpiralTraverse
{
    //Function to return a list of integers denoting spiral traversal of array.matrix.
    static void spirallyTraverse(int matrix[][], int r, int c)
    {
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(left<=right && top<=bottom){
            
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}