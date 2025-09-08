package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            doFizzBuzz(i);
            i++;
        }
    }
    
    private static void doFizzBuzz(int n) {
        boolean divisibleBy3 = n % 3 == 0;
        boolean divisibleBy5 = n % 5 == 0;
        
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
    
}
