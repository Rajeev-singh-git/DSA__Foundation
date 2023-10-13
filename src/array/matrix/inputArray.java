package array.matrix;

import java.util.Scanner;

public class inputArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }


        System.out.println("Boundary Traversal output");
        boundaryTraversals bt =new boundaryTraversals();
        bt.boundaryTraversal(matrix,r,c);


        System.out.println("Matrix Snake Pattern");
        MatrixSnakePattern msp = new MatrixSnakePattern();
        msp.snakePattern(matrix);


        System.out.println("Spiral Traverse Matrix ");
        MatrixSpiralTraverse mst = new MatrixSpiralTraverse();
        mst.spirallyTraverse(matrix,r,c);

        System.out.println("Exchange Matrix Column output");
        exchangeMatrixColumn emc = new exchangeMatrixColumn();
        emc.exchangeColumns(matrix);

    }


}
