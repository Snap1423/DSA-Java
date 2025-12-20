package Patterns;
class alpha_triangle2{
    public void sol(int n){
        for(int i =0; i<n;i++){
            for(char ch = (char) ('E' - i); ch<='E'; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
public class pattern18 {
    public static void main(String[] args) {
        alpha_triangle2 r1 = new alpha_triangle2();
        r1.sol(5);
    }
}
