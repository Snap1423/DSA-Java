package Patterns;
class pat_ern{
    public void sol(int n){
        int init =0;
        for(int i =0; i<n; i++){
            //stars
            for(int j =1; j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =0; j<=init; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n-i;j++){
                System.out.print("*");
            }
            init += 2;
            System.out.println();
        }
        int initS = 8;
        for(int i =1; i<=n; i++){
            // stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =0; j<initS; j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            initS -= 2;
            System.out.println();
        }
    }
}
public class pattern19 {
    public static void main(String[] args) {
        pat_ern e1 = new pat_ern();
        e1.sol(5);
    }
}
