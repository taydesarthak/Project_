package arrays;

public interface passingarryatomethod {
    public static void main(String[] args) {
        int x[]={4,5,6,7,8,};

        System.out.println(x[2]);
         change(x);
         
    System.out.println(x[2]);

    }
    public static void change(int []x)
        {
        x[2]=75;
    }
}
