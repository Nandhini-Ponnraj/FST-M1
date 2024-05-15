package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] number = {10, 77, 10, 54, -11,10};
        int temp = 0;
        int expectedNum = 10;
        int expectedSum = 30;
       // String s;
       System.out.println("Is sum of 10 in the array equals 30?  " +findSum(number,expectedNum,expectedSum));
    }
       public static boolean findSum(int[] number,int expectedNum,int expectedSum){
        int temp=0;
           for(int x: number){
if(x==10){
    temp=temp+x;
           }
if(temp>30){
    break;
}
       }
           return temp==expectedSum;
    }
}
