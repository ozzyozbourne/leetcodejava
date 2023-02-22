package org.example.recursion;

public class Print2dArray {

    public static void main(String[] args) {
        printArray(new long[][] {{1,2}, {3,4}, {5,6}}, 0, 0);
    }

    public static void printArray(long [][]a, int r, int c){
        if(r < a.length){
            if(c < a[r].length){
                System.out.print(a[r][c] + " ");
                printArray(a, r, ++c);
                return;
            }
            System.out.println();
            printArray(a, ++r, c = 0);
        }
    }

}
