import java.util.Arrays;
import java.util.Scanner;

public class PrimeSort {
    //nearest prime <= x
    static int nearestPrime1(int x){
        for(int i=x;i>=2;i--){
            boolean f=true;
            if(i==2)
                return i;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f)
                return i;
        }
        return -1;
    }
    // nearest prime > x
    static int nearestPrime2(int x){
        for(int i=x+1;i<=Integer.MAX_VALUE;i++){
            boolean f=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        //10 12 13 23 35
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size ");
        int n=sc.nextInt();
        System.out.println("Enter values");
        int a[]=new int[n];
        for (int i = 0; i < n; i++)
            a[i]= sc.nextInt();
        //to store the min diff
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=Math.min(Math.abs(nearestPrime1(a[i])-a[i]),Math.abs(nearestPrime2(a[i])-a[i]));
        }

        for (int i = 0; i < a.length; i++) {
            for (int j=i+1;j<a.length;j++){
                if(b[j]<b[i]){
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;

                    t=b[j];
                    b[j]=b[i];
                    b[i]=t;
                } else if (b[j]==b[i]) {
                    if(a[j]<a[i]){
                        int t=a[j];
                        a[j]=a[i];
                        a[i]=t;

                        t=b[j];
                        b[j]=b[i];
                        b[i]=t;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
