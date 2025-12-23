package basic_maths;
class rev_num{
    public void sol(int n){
        int revNum =0;
        while(n>0){
            int ld = n%10;
            revNum = (revNum *10) + ld;
            n = n/10;
        }
        System.out.println(revNum);
    }
}
public class reverse_number {
    public static void main(String[] args) {
        rev_num v1 = new rev_num();
        v1.sol(456);
    }
}
