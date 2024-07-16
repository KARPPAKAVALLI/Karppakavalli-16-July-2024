import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSort {
    //test case 1 : 13 2 4 15 12 10 5
    //test case 2 : 1 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        System.out.println("Enter n elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            //even positions
            if((i+1)%2==0){
                for(int j=i;j<n;j+=2){
                    //ascending order
                    if(arr[j]<arr[i]){
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
            //odd positions
            else{
                for(int j=i;j<n;j+=2){
                    //descending order
                    if(arr[j]>arr[i]){
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
