// prime.java
// This program checks if a number is prime
// added comments 
//prime program
public class prime {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        int number = 8; // You can change this number for testing
        if (isPrime(number)) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }
    }
}
