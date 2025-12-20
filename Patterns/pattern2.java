package Patterns;
class right_triangle{
    public void sol() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class pattern2 {
    public static void main(String[] args) {
        right_triangle r1 = new right_triangle();
        r1.sol();

    }
}

