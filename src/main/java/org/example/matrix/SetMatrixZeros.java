package org.example.matrix;

public class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean zeroRow = false;
        for(int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    if(i > 0) matrix[i][0] = 0;
                    else zeroRow = true;
                }

        for(int i = 1; i < row; i++)
            for (int j = 1; j < col; j++)
                if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;

        if (matrix[0][0] == 0)
            for(int i = 1; i < row; i++)
                matrix[i][0] = 0;

        if (zeroRow)
            for (int j = 0; j < col; j++)
                matrix[0][j] = 0;
    }

}
