package DsaFundamentals.ControlFlow;

public class LoopsPractice4 {
    public static void main(String[] args) {
        // P1
        int num = 6;
        int numSum = 1;
        if (num > 5 && num % 2 == 0) {
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                    numSum += i;
                    if (i != num / i) {
                        numSum += num / i;
                    }
                }
            }
            System.out.println(num == numSum);
        }

        // P2
        int n = 100;
        for (int i = 6; i <= n; i += 2) {
            int numSum1 = 1;
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    numSum1 += j;
                    if (j != i / j) {
                        numSum1 += i / j;
                    }
                }
            }
            if (numSum1 == i) System.out.print(i + ",");
        }
        System.out.println();

        // P3
        int number = 145;
        int opNumber = number;
        int numberFactorialSum = 0;
        while (opNumber > 0) {
            int currDigit = opNumber % 10;
            opNumber /= 10;

            int currDigitFactor = 1;
            for (int i = 2; i <= currDigit; i++) {
                currDigitFactor *= i;
            }

            numberFactorialSum += currDigitFactor;
        }
        System.out.println(number == numberFactorialSum);

        // P4
        // wypisywanie liczb silnych za pomoca petli jest bez sensu, jest ich bardzo malo,
        // 1, 2, 145, 40 585 do zakresu 10 mld, to sa jedyne liczby silne, wiec absurdalnym pomyslem,
        // jest iterowanie jakiekolwiek w poszukiwaniu takowych, wystarczy po prostu zadeklarowac
        // gotowy zbior i np. iterowac po gotowej tablicy z tymi liczbami i jezeli miesci sie w podanym zakresie to ja zwracac.
        int range = 10;
        int[] strongNumbers = {1, 2, 145, 40585};
        for (int i = 0; strongNumbers[i] < range; i++) {
            System.out.print(strongNumbers[i] + ",");
        }
    }
}
