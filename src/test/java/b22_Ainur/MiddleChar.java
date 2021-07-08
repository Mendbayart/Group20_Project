package b22_Ainur;

import java.util.Scanner;

public class MiddleChar {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            if(word.length() % 2 == 1) {
                // odd
                System.out.println(word.charAt(word.length() / 2));
                System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
            }else {
                // even
                int index = word.length()/2;
                System.out.println(word.charAt(index-1) + "" + word.charAt(index));
                System.out.println(word.substring(index-1, index+1));
            }
        }
    }

