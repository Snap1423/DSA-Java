package Patterns;
class reverse_triangle{
    public void sol(){
        for(int i =1; i<=5; i++){
            for(int j = 0; j<5-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class pattern5 {
    public static void main(String[] args) {
        reverse_triangle r1 = new reverse_triangle();
        r1.sol();
    }
}
