package Recursion_Level_1;

import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }

        int maxi=max(arr,0);
        System.out.println(maxi);
    }
    public static int max(int[] arr,int idx){

        if(idx==arr.length-1){
            return arr[idx];
        }

        int misa=max(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
