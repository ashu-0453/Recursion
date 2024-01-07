package Recursion_Level_1;

import java.util.Scanner;

public class PowerLogarithmic {
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
        int xnb2=pow(x,n/2);
        int xn=xnb2*xnb2;
        if(n%2==1){
            xn=xn*x;
        }
        return xn;

    }
}
