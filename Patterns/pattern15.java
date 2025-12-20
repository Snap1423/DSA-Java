package Patterns;
class alpha_rev_tri{
    public void sol(int n){
        for(int i =0; i<n;i++){
            for(char ch = 'A'; ch<= 'A' + (n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
public class pattern15 {
    public static void main(String[] args) {
        alpha_rev_tri c1 = new alpha_rev_tri();
        c1.sol(6);
    }
}
