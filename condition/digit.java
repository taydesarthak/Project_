package condition;

import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = sc .nextInt();

        if(n>33 && n<3939){
            System.out.println("3 digit number : ");

        }else{
            System.out.println("not a 3 digit number : ");
        }

        
    }
}
