package Recursion_Level_1;

public class FirstIndexOccurrence {
    public static void main(String[] args) {
        int[] arr={1,3,2,3,2};
        int i = firstIndex(arr, 0, 3);
        System.out.println(i);

    }

    public static int firstIndex(int[] arr,int idx,int x){

        if (idx== arr.length){
            return -1;
        }

        if (arr[idx]==x){
            return idx;
        }else{
            int fiisa=firstIndex(arr,idx+1,x);
            return fiisa;
        }



//        int fiisa=firstIndex(arr,idx+1,x);
//
//        if(arr[idx]==x){
//            return idx;
//        }else {
//            return fiisa;
//        }
        
    }
}
