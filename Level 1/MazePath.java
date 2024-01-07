package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of maze : ");
        int n=sc.nextInt();
        System.out.print("Enter cols of maze : ");
        int m=sc.nextInt();

        ArrayList<String> ans=getMazePath(1,1,n,m);
        System.out.println(ans);
    }
    //sr - source row ; sc - source column
    //dr - destination row ; dc - destination column
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> bRes=new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        ArrayList<String> hpaths=new ArrayList<>();
        ArrayList<String> vpaths=new ArrayList<>();
        if(sc<dc){
            hpaths=getMazePath(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpaths=getMazePath(sr+1,sc,dr,dc);
        }
        ArrayList<String> paths =new ArrayList<>();
        for(String hpath:hpaths){
            paths.add("h"+hpath);
        }
        for(String vpath:vpaths){
            paths.add("v"+vpath);
        }
        return paths;

    }
}
