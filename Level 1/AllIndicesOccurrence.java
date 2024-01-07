package Recursion_Level_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AllIndicesOccurrence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements : ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is : "+Arrays.toString(arr));

        System.out.println("The index array is : "+Arrays.toString(allIndices(arr,3,0,0)));

    }

    static int[] allIndices(int[] arr, int x,int idx,int fsf){
        if(idx==arr.length){
            return new int[fsf];
        }

        if(arr[idx]==x){
            int[] iarr=allIndices(arr,x,idx+1,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }else{
            int[] iarr=allIndices(arr,x,idx+1,fsf);
            return iarr;
        }
    }
}
