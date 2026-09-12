package arrays;

import java.util.Scanner;

public class indexmultiplay {
    
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 7, 2};

        for (int i = 0; i < arr.length; i++) {
            
            if (i % 2 == 0) { 
                arr[i] = arr[i] *2;
            } else {           
                arr[i] = arr[i] +10;
            }
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



    

