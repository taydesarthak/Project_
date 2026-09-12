package condition;

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st number:");
        int a= sc .nextInt();
        System.out.println("enter 2nd num");
        int b=sc .nextInt();
        System.out.println("enter 3rd no:");
        int c=sc .nextInt();

        if(a>b && b>c){
            System.out.println("a");
        }else if(b>a && b>c){
            System.out.println("b");
        }else if(c>a && c>b){
            System.out.println("c");
        }
    }
    
}
