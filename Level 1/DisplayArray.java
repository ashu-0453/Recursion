package Recursion_Level_1;

public class DisplayArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        disArr(arr,0);
    }

    public static void disArr(int[] arr,int index){
        if(index>=arr.length){
            return;
        }
        System.out.println(arr[index]);
        disArr(arr,index+1);

    }
}
