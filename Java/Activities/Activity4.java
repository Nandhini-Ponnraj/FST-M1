package activities;

import java.util.Arrays;

public class Activity4 {
    //insertion sort
    public static void main(String[] args){
        int[] random={4,3,2,10,12,1,5,6};
        System.out.println("Before sorting: " + Arrays.toString(random));
        for(int i=0;i<random.length;i++){
            for(int j=i+1;j<random.length;j++){
                if(random[i]>random[j]){
                    int temp;
                    temp=random[i];
                    random[i]=random[j];
                    random[j]=temp;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(random));
    }
}
