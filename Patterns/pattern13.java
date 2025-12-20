package Patterns;
class right_t{
    int num =1;
    public void sol(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(num + " ");
                num+=1;
            }
            System.out.println();
        }
    }
}
public class pattern13 {
    public static void main(String[] args) {
        right_t t1 = new right_t();
        t1.sol(6);
    }
}
