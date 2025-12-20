package Patterns;
class reverse_number_triangle{
    public void sol(){
        for(int i =0; i<=5; i++){
            for(int j = 1; j<5-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class pattern6 {
    public static void main(String[] args) {
        reverse_number_triangle e1 = new reverse_number_triangle();
        e1.sol();
    }
}
