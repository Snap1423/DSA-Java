package Patterns;
class diamond{
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
class diamond2{
    public void sol2(){
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
public class pattern9 {
    public static void main(String[] args) {
        diamond d1 = new diamond();
        diamond2 d2 = new diamond2();
        d1.sol();
        d2.sol2();
    }
}
