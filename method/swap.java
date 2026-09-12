package method;

public interface swap {
    public static void main(String[] args) {
        
        int a= 40 , b= 58;
        System.out.println(a+ " " +b);
       
        int temp =a;
        a = b;
        b= temp ; 
        System.out.println(a+ " " +b);
    }
}
