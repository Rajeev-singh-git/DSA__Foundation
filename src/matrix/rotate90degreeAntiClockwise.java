package matrix;

class rotate90degreeAntiClockwise
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
     
        //Transpose of Matrix = 1st row become 1st column, 2nd row become 2nd column ....last row become last column
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        // Reversing columns

        for(int i=0, j=n-1;i<j;i++,j--){
            for(int k=0;k<n;k++){
                int temp = matrix[i][k];
                matrix[i][k]=matrix[j][k];
                matrix[j][k] =temp;
            }
        }
        
        
    }
}