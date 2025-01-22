package Assignment1;

import java.util.*;
public class NumToWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words= new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        String s="";
        while(n>0) {
            int r = n%10;
            s = words[r]+" "+s;
            n /= 10;
        }
        System.out.print(s);
        sc.close();
    }
}