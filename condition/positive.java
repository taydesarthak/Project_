package condition;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      System.out.println("enter the numer:");
    int n = sc .nextInt();
   
    
    if(n%5==0){
        System.out.println("aishwarya");

    }else if(n%3==0){
        System.out.println("vishal");

    }else if(n%5==0 && n%3==0){
        System.out.println("rohan");
    }else{
        System.out.println("not divsible by 5 or 3");
    }
    
    
    
    
    }
}
