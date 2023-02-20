package org.example.matrix;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int left = 0, right = matrix.length - 1;
        while(left < right){
            int top = left, bottom  = right;
            for(int i = 0; i < right -left; i++){
                var temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i]= matrix[top + i][right];
                matrix[top + i][right] = temp;
            }left++; right--;
        }
    }
}
