package _1D_Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("Numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}