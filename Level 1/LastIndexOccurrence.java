package Recursion_Level_1;

public class LastIndexOccurrence {
    public static void main(String[] args) {
        int[] arr={2,1,3,2,1,3,4,2};
        int ans=lastIndex(arr,0,3);
        System.out.println(ans);

    }

    public static int lastIndex(int[] arr,int idx,int x){

        if (idx>=arr.length){
            return -1;
        }

        int liisa=lastIndex(arr,idx+1,x);
        if(liisa==-1){
            if (arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
}
