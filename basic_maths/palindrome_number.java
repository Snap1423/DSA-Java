package basic_maths;
class palin_num {
    public void sol(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if(dup == revNum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

public class palindrome_number {
    public static void main(String[] args) {
        palin_num n1 = new palin_num();
        n1.sol(122);
    }
}
