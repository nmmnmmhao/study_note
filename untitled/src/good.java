import java.util.Scanner;

public class good {
    public static void main(String[] args){
        MyTools mt = new MyTools();
        int[] arr = {10,-1,5,6,7};
        mt.bubble(arr);
        new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
class MyTools{

    public void bubble(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j<arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}