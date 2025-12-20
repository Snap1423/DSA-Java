package Patterns;
class number_box{
    public void sol(int n){
        for(int i = 0; i<2*n-1; i++){
            for(int j =0; j<2*n-1; j++){
                int top =i;
                int left = j;
                int right = (2*n-2) -j ;
                int down = (2*n-2) -i ;
                System.out.print(n- Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }

    }
}
public class pattern22 {
    public static void main(String[] args) {
        number_box s1 = new number_box();
        s1.sol(4);
    }
}
