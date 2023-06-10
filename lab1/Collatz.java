/** Class that prints the Collatz sequence starting from a given number.
 *  @author Dennis Wong Guan Ming
 */
public class Collatz {

    /** Description: Implement Algorithm for Collatz sequence*/
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n/2; // also handles the end case -> 2/2 = 1
        } else if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n; // will not run this condition
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println(); // prints newline
    }
}

