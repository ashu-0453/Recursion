package Recursion_Level_1;
/*


1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]
 */



import java.util.Scanner;

public class TowerOfHanoi_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.print("Enter A, B and C : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        TOH(n,a,b,c);

    }

    public static void TOH(int n,int a, int b, int c){
        if(n==0){
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println(n+ "[" +a+ "->" +b+ "]");
        TOH(n-1,c,b,a);
    }
}
