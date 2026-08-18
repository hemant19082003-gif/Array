package _1D_Array;
import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Sizeof Array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Element");
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum of element"+ " "+ sum );
    }
}
