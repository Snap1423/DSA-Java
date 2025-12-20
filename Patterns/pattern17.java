package Patterns;
class full_tri_alpha{
    public void sol(int n){
        for(int i = 0; i<n; i++){
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j =0; j<2*i+1; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class pattern17 {
    public static void main(String[] args) {
        full_tri_alpha b1 = new full_tri_alpha();
        b1.sol(5);
    }
}
