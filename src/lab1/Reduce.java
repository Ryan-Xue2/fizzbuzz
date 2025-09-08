package lab1;

public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int steps = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i -= 1;
            }
            steps++;
        }
        System.out.println(steps);
    }
    public static int reduce(int start) {
        int i = start;
        int steps = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i -= 1;
            }
            steps++;
        }
        return steps;
    }
}