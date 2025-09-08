package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }
    public static int multiples(int n, int a, int b) {
        /*
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                res++;
            } 
        }
        return res;
        */
        int res = 0;
        res += --n / a;
        if (a != b) {
            res += n / b;
            res -= n / (a*b);
        }  
        return res;
    }
    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
