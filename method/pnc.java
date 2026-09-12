package method;

import java.util.Scanner;

public interface pnc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r= sc .nextInt();

        int nfact=1;
        for(int i=1; i<=n; i++){
            nfact *=i;


        }
        int rfact=1;
        for(int i=1; i<=r; i++){
            rfact *=i;
    }
        int nrfact=1;
        for(int i=1; i<=n-r; i++){
            nrfact *=i;
        }
        int ncr = nfact /(rfact*nrfact);
        System.out.println(ncr);
    }
}
     
