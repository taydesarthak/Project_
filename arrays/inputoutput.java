package arrays;

import java.util.Scanner;

public class inputoutput {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element :");
       
        int [] sarthak = new int [7];


      //  for(int i=0; i<7; i++){

          // System.out.print(sarthak[i]);
     //   }
        //input
        for(int i=0 ; i<7; i++){
        sarthak[i]=sc.nextInt();

        }//print
        for(int i=0; i<=7; i++){

            System.out.print(sarthak[i]+"    ");
        }
          
            }
    }


