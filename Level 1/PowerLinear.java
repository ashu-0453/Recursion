package Recursion_Level_1;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x and n : ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }

    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }

        int xnm1=pow(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
}
