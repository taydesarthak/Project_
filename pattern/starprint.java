package pattern ;

import java.util.Scanner;

public class starprint {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter row or coloum:");

    int row= sc .nextInt();
    int coloum= sc.nextInt();
    
    for(int i=1; i<=row; i++){
        for(int j=1; j<=coloum; j++){

   System.out.print("*");
}

   System.out.println();
    }
    }
}  
    

