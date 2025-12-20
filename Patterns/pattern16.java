package Patterns;
class alpha_same_tri{
    public void sol(int n){
        for(int i =0; i<=n;i++){
            char ch = (char) ('A' + i);
            for(int j =0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
public class pattern16 {
    public static void main(String[] args) {
        alpha_same_tri r1 = new alpha_same_tri();
        r1.sol(7);
    }
}
