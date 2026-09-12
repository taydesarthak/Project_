package arrays;

public class compare {
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,7,5};
        int x = 5;
        int a=0;

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               System.out.println("Element found at idx : "+i);
               a=1;
                
            }
        }
        if(a==0)
        System.out.println("Element not found");

        
    }
}
