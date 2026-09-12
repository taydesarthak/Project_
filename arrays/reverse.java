package arrays;

public class reverse {
   

    public static void main(String[] args) {
        int arr[]={3,5,7,8,5,45};
         int n = arr.length;
       int i =0; 
       int j= n-1;

       while(i<j){
        
        int temp=arr[i];
        arr[i]= arr[j];



        arr[j]=temp;

        i++;
        j--;





       }
       for(int k=0; k<arr.length; k++){

        System.out.print(arr[k]);

      
       }
       

    }

}
