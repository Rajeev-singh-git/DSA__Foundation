package array.matrix;

import java.util.ArrayList;

class MatrixSnakePattern
{
    //Function to return list of integers visited in snake pattern in array.matrix.
    static void snakePattern(int matrix[][])
    {
        // code here 
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        
        for(int i=0;i<matrix.length;i++){
            
               if(i%2!=0){
                    for(int j=matrix[0].length-1;j>=0;j--){
                      list.add(matrix[i][j]);
                   }
                  }else{
                      for(int j=0;j<=matrix[0].length-1;j++){
                        list.add(matrix[i][j]);
                     }
                   }
            }

        //   return list;

         for (int i : list) {
             System.out.println(i);
         }
     
        }


        
}