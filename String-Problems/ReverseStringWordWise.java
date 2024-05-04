/*
https://www.naukri.com/code360/problems/reverse-string-word-wise_1262348?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

*/

import java.util.Scanner;

public class ReverseStringWordWise {
     static String reverseStringWordWise(String input) {
        // Write your code here
       String s = "";
       String[] words = input.split(" ");
       //System.out.println (words.length);
       for(int i=words.length-1;i>=0;i--){
          // System.out.println(i);
           s = s+ (words[i]+" ");
       }
       return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }

    //Welcome to Coding Ninjas
    
}
