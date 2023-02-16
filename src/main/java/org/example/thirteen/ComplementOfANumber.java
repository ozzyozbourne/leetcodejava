package org.example.thirteen;

public class ComplementOfANumber {

    static public int bitwiseComplement(int n) {
        if (n == 0)return 1;
        int bit_count = 0, n_copy = n;
        while(n_copy > 0){
            bit_count++;
            n_copy = n_copy >> 1;
        }return  n ^ (int)Math.pow(2, bit_count) - 1;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(0));
    }
}
