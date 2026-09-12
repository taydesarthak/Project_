package arrays;

public class segrigate0s1s {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,1,0,1,0,1,0,1,0,1};

        int noz = 7; 

        
        for(int i = 0; i < noz; i++){
            arr[i] = 0;
        }

        for(int i = noz; i < arr.length; i++){
            arr[i] = 1;
        }  


        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}