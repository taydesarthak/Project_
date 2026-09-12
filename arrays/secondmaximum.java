package arrays;

public class secondmaximum {
    
    public static void main(String[] args) {
        int arr[]={3,65,76,84,67,8};

        int max=arr[0];
        int smax=arr[0];
        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                smax=max;
                max=arr[i];
            } 
            else if(arr[i]>smax&& arr[i]!=max)
                {
                    smax=arr[i];
                } 
          }
        //     System.out.println(max) ;  
        
        // for(int i=1; i<arr.length;i++){
           
        //     if(arr[i]>smax && arr[i] != max) 
        //          {

        //             smax=arr[i];
        //          }
        // }
        
        System.out.println(smax);
    }
}
