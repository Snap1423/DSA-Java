package Patterns;
class inverted_pattern_triangle{
    public void sol(int n){
        for(int i = 1; i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j = 1;j<= stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class pattern10 {
    public static void main(String[] args) {
        inverted_pattern_triangle d1 = new inverted_pattern_triangle();
        d1.sol(5);

    }
}