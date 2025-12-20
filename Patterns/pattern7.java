package Patterns;
class full_triangle{
    public void sol(){
        for(int i = 0; i<5; i++){
            //space
            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j =0; j<2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class pattern7 {
    public static void main(String[] args) {
        full_triangle f1 = new full_triangle();
        f1.sol();
    }
}
