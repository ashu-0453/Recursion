package Recursion_Level_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
}
