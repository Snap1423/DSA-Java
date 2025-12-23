package basic_maths;

public class digits {
    public static int sol(int n){
        int count =0;
        while(n>0){
            int lastDigit = n%10;
            count = count+1;
            n = n /10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7789;
        System.out.println("N : " + n);
        int digits= sol(n);
        System.out.println(digits);
    }
}
