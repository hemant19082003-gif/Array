package _1D_Array;
import java.util.Scanner;
public class printarray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter Array");
        for(int i=0 ;i<arr.length;i++){    // n or arr.length
            arr[i] = sc.nextInt();
        }
        for(int i=0 ;i<n;i++){
            System.out.print( arr[i]+" ");
        }
    }
}
