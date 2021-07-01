package b22_Bahar;

import java.util.Arrays;

public class ReverseArrayNumber {
    public static void main(String[] args) {
        int [] number = {800, 500, 200, -400,0 ,25};
        int [] reverseNumber = new int[number.length];
        for (int i = number.length-1, j =0; i>=0 ; i--, j++) {
           reverseNumber[j] = number[i];
        }
        System.out.println(Arrays.toString(reverseNumber));
    }
}
