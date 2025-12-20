package Patterns;
class same_number{
    public void sol() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
public class pattern4 {
    public static void main(String[] args) {
        same_number s1 = new same_number();
        s1.sol();
    }
}
