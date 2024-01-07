package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class StairsPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        ArrayList<String> ans=getStairPath(n);
        System.out.println(ans+ " "+ans.size());

    }
    public static ArrayList<String> getStairPath(int n){
        if(n==0){
            ArrayList<String> bRes=new ArrayList<>();
            bRes.add("");
            return bRes;
        }else if(n<0){
            ArrayList<String> bRes=new ArrayList<>();
            return bRes;
        }

        ArrayList<String> paths1=getStairPath(n-1);
        ArrayList<String> paths2=getStairPath(n-2);
        ArrayList<String> paths3=getStairPath(n-3);
        ArrayList<String> paths=new ArrayList<>();

        for(String path: paths1){
            paths.add(1+path);
        }
        for(String path: paths2){
            paths.add("2"+path);
        }
        for(String path: paths3){
            paths.add(3+path);
        }
        return paths;
    }
}
