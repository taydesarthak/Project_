package arrays;

public class minimum {
    public static void main(String[] args) {
        int [] arr= {45,6,7543,4,5,1,546,3454};
        int min =arr [0];

        for(int i=0; i<arr.length; i++){

 
            if(arr[i]<min)
                {

                min=arr[i];
            }
           
            
        }
         System.out.println(min);

    }
}
