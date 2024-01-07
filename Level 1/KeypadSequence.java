package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadSequence {
    static String[] code={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Keypad number : ");
        String str=sc.next();

        ArrayList<String> ans=getKeypadSeq(str);
        System.out.println(ans + "\nTotal Sequences : "+ans.size());

    }
    public static ArrayList<String> getKeypadSeq(String str){
        if(str.length()==0){
            ArrayList<String> bRes=new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=getKeypadSeq(ros);
        ArrayList<String> mres=new ArrayList<>();
        String codeStr=code[ch-'0'];
        for (int i = 0; i < codeStr.length(); i++) {
            char codeCh=codeStr.charAt(i);
            for (String rst : rres) {
                mres.add(codeCh+rst);
            }
        }
        return mres;
    }
}
