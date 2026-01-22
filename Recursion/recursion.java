package Recursion;

public class recursion {
    static void rec(){
        System.out.println(1);
        rec();
    }
    public static void main(String[] args) {
        rec();
    }
}
