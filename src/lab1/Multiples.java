package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }
    public static void multiples(int n, int a, int b) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                res++;
            } 
        }
        return res;
    }
}
