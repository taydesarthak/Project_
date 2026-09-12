package arrays;

public class pointer {
    public static void main(String[] args) {
        
        int arr[]={1,0,1,0,1,0,0,1,0,1,0,};
         int n = arr.length; 
        int i=0;
        int j = n-1;
       
        while(i<j){
            if(arr[i]==0)i++;
            if(arr[j]==1) j--; 
            if(arr[i]==1 && arr[j]==0){

            

           int temp=arr[i];
        arr[i]= arr[j];

        arr[j]=temp;
            }
    }
    for(int k=0; k<arr.length; k++){
        System.out.println(arr[k]+ " ");
    }
}
}