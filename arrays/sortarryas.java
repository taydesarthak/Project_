package arrays;

import java.util.Arrays;

public class sortarryas {
    public static void main(String[] args) {
        int []arr={
            4,3,5,7,8,54,67,88,7,5
        };
        print(arr);
        Arrays.sort(arr);
        print(arr);

        
    }public static void print(int [] arr) {

      for(int i=0; i<arr.length; i++)
            {
            System.out.print(arr[i]+" ");
        }
      System.out.println();
        
    }
}
