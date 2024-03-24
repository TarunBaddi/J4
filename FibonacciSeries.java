package CIE_1.J4;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            /*
             * On each iteration, we are assigning second term to the first term
             * and assigning the sum of last two terms to the second term
             */
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
