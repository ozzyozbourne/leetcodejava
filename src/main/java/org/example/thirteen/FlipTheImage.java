package org.example.thirteen;

public class FlipTheImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        var C = image[0].length;
        for(var row : image){
            for(int i = 0; i<(C + 1)/2; i++){
                var temp = row[i] ^ 1;
                row[i] = row[C-1-i] ^ 1;
                row[C-1-i] = temp;
            }
        }return image;
    }

    public static void main(String[] args) {

    }
}
