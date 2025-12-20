package Patterns;
class box{
    public void sol(int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
               if(i ==0 || j==0|| i== n-1 || j== n-1){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
public class pattern21 {
    public static void main(String[] args) {
        box b1 = new box();
        b1.sol(5);
    }
}
