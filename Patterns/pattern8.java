package Patterns;
class rev_full_triangle{
    public void sol(){
        for(int i = 0; i<5; i++){
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j =0; j<2*5-(2*i+1); j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class pattern8 {
    public static void main(String[] args) {
        rev_full_triangle e1 = new rev_full_triangle();
        e1.sol();

    }
}
