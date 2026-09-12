package arrays;

public class basic {
    public static void main(String[] args) {
      int arr[]={1,8,7,56,90};
      int max=arr[0];

      for(int i=0; i<arr.length; i++){
         if(arr[i]>max){
          max = arr[i];
      }
  
    }System.out.println(max);


    }
}
