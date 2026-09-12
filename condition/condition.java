package condition;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter sp:");
        int sp = sc .nextInt(); 
        
        System.out.println("enter cp :");
        int cp = sc. nextInt();    
       
        if(sp > cp){
            System.out.println("profit is ");

        }else if(cp > sp){
            System.out.println("loss is ");

        }else{
            System.out.println("no profit no loss:");
        }
    
    
    }

    
}
