public class PrimeFinder {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 1000) + 1; // 1 to 1000
        int num2 = (int) (Math.random() * 1000) + 1; // 1 to 1000

        int lower = Math.min(num1, num2);
        int upper = Math.max(num1, num2);

        System.out.println("Random number 1: " + num1);
        System.out.println("Random number 2: " + num2);
        System.out.println("Searching for primes between " + lower + " and " + upper + "...\n");

        boolean foundAny = false;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                foundAny = true;
            }
        }

        if (!foundAny) {
            System.out.println("No prime numbers found in this range.");
        }
    }

    // Checks whether a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        // Only need to check odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}