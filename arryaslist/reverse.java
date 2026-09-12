package arryaslist;
import java.util.ArrayList;
public class reverse {
    public static void main(String[] args) {
        
  ArrayList<Integer> arr= new ArrayList<>();

  arr.add(75);
  arr.add(85);
  arr.add(34);
  arr.add(77);
  arr.add(90);
  arr.add(82);
  arr.add(76);
                                               
     System.out.println(arr);

     int i=0 , j=arr.size()-1;
     while(i<j){

        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        i++;
        j--;
      
      
     }
     System.out.println(arr +" ");


    }
}