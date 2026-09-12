package condition;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc .nextInt();

        if (n<69){

            System.out.println("yes the magnitude of smaller than 69");
        }else{

            System.out.println("no the magnitude of not a smaller than 69 ");
        }
    }
}
