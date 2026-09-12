package pattern;

import java.util.Scanner;
public class hollowrectangle{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row= sc.nextInt();
    int coloum= sc.nextInt();

     for(int i=1; i<=row; i++){
        for(int j=1; j<=coloum; j++){

            if(i==1 || i==row || j==1 || j==coloum){
                System.out.print("* ");
            }else{
                System.out.print(" ");
            }

        System.out.println();
       
        
    }
    
    }
    
}


}
    




    
