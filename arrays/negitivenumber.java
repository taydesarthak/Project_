package arrays;

import java.util.Scanner;

public class negitivenumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter arrya size :");

      int n = sc.nextInt(); 
      int arr[]= new int [n];
      System.out.print("enter arrya element :");
      
      for(int i=0 ; i<n ; i++)
      arr[i]=sc.nextInt();


      //print
      for(int i=0; i< n; i++)
      
       if(arr[i]<0)System.out.print(arr[i]+"  ");
   

      
    }
      

        
      

    
}
