package matrix;

class MatrixMultiplication
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {

        int colA = A[0].length;
        int rowB = B.length;

        int[][] res = new int[A.length][B[0].length];

        // Size of column of matrix A should be equal to row of matrix B

        if(colA!=rowB){
            return  new int[0][0];
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k=0;k< B.length;k++){
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return res;
    }
}