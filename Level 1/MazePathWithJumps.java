package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of maze : " );
        int n=sc.nextInt();
        System.out.print("Enter cols of maze : " );
        int m=sc.nextInt();
        ArrayList<String> ans=getMazePathWithJumps(1,1,n,m);
        System.out.println(ans);
    }

    public static ArrayList<String> getMazePathWithJumps(int sr,int sc,int dr,int dc){

        if(sc==dc && sr==dr){
            ArrayList<String> bRes=new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        ArrayList<String> paths=new ArrayList<>();

        //horizontal moves
        for(int moveSize=1;moveSize <= dc-sc;moveSize++){
            ArrayList<String> hpaths=getMazePathWithJumps(sr,sc+moveSize,dr,dc);
            for(String hpath:hpaths){
                paths.add("h" + moveSize + hpath);
            }
        }

        //vertical moves
        for(int moveSize=1;moveSize <= dr-sr;moveSize++){
            ArrayList<String> vpaths=getMazePathWithJumps(sr+moveSize,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("v" + moveSize + vpath);
            }
        }

        //Diagonal moves
        for(int moveSize=1;moveSize <= (dr-sr) && moveSize<= (dc-sc);moveSize++){
            ArrayList<String> dpaths=getMazePathWithJumps(sr+moveSize,sc+moveSize,dr,dc);
            for(String dpath:dpaths){
                paths.add("d" + moveSize + dpath);
            }
        }

        return paths;

    }
}
