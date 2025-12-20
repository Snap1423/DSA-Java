package Patterns;
class Solution1{
    public void sol(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class pattern1 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        s1.sol(5);
    }
}
