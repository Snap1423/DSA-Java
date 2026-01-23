package Recursion;

public class recursion_3 {
    static void sol(String name, int count, int n){
        if(count == n){
            return;
        }
        System.out.println(name);

        sol(name, count+1, n);
    }
    public static void main(String[] args) {
        recursion_3 v1 = new recursion_3();
        int n = 5;
        String name = "Kushal R";
        sol(name,0,n);

    }
}
