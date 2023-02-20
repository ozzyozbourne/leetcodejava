package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        var res = new ArrayList<Integer>();
        int left = 0, right = matrix[0].length, top = 0, bottom = matrix.length;
        while (left < right && top < bottom) {
            for(int j = left; j <right; j++) res.add(matrix[top][j]);
            top++;
            for(int j = top; j < bottom; j++) res.add(matrix[j][right -1]);
            right--;
            if (!(left < right && top < bottom))break;
            for(int j = right - 1; j >= left; j--)res.add(matrix[bottom -1][j]);
            bottom--;
            for(int j = bottom -1; j >= top; j--)res.add(matrix[j][left]);
            left++;
        }return res;
    }

}
