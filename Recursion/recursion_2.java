package Recursion;

public class recursion_2 {
    static int count =0;
    static void rec_2(){
        if(count == 3) return; {
            System.out.println(count);
        }
        count++;
        rec_2();

    }
    public static void main(String[] args) {
            rec_2();
    }
}
