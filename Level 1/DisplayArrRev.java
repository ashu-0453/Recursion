package Recursion_Level_1;

public class DisplayArrRev {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        disArrRev(arr,0);
    }

    public static void disArrRev(int[] arr,int index){
        if(index>= arr.length){
            return;
        }
        disArrRev(arr,index+1);
        System.out.println(arr[index]);
    }
}
