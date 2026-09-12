package arrays;

public class product {
    public static void main(String[] args) {
        int [] arr ={4,3,4};
         int product= 1;

         for(int i=0; i<arr.length; i++){
            product *= arr[i];
         }System.out.println(product);

    }
}
