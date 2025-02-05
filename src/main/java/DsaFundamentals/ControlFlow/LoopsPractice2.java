package DsaFundamentals.ControlFlow;

public class LoopsPractice2 {
    public static void main(String[] args) {
        // P1
        int num = 17;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + ",");
                System.out.print(num / i + ",");
            }
        }
        System.out.println();

        // P2 prime num
        int num1 = 17;
        boolean isPrime = true;
        for (int i = 2; i * i <= num1; i++) { // only to sqrt(n) cause we do not need to check higher than sqrt(n) pairs, cause when we got some factor before in the sqrt(n) range its defines that is a prime or not number, it's enough check
            if (num1 % i == 0) { // if any factor between 1 and n, it's a prime number
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

        // P3
        int end = 20;
        System.out.print(2 + ",");
        for (int i = 3; i < end; i += 2) {
            boolean isPrime1 = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) System.out.print(i + ",");
        }
        System.out.println();

        // P4
        int num3 = 17;
        for (int i = 2; i <= num3; i++) {
            if (num3 % i == 0) {
                boolean isPrime2 = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime2 = false;
                        break;
                    }
                }
                if (isPrime2) System.out.print(i + ",");
            }
        }
    }
}
