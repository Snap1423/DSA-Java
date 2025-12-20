package Patterns;
class alpha_triangle{
    public void sol(int n){
        for(int i =0; i<n; i++){
            for(char ch = 'A'; ch<='A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
public class pattern14 {
    public static void main(String[] args) {
        alpha_triangle t1 = new alpha_triangle();
        t1.sol(5);
    }
}
