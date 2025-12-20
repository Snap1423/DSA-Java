package Patterns;
class number_right_triangle{
    public void sol(){
        int start =1;
        for(int i =0; i<5; i++){
            if(i%2==0){
                start = 1;
            }
            else {
                start =0;
            }
            for(int j =0; j<=i; j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
}
public class pattern11 {
    public static void main(String[] args) {
        number_right_triangle w2 = new number_right_triangle();
        w2.sol();

    }
}
