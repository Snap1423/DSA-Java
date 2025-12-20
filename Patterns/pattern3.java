package Patterns;
class number_triangle{
    public void num_tri() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class pattern3 {
    public static void main(String[] args) {
        number_triangle n1 = new number_triangle();
        n1.num_tri();

    }
}
