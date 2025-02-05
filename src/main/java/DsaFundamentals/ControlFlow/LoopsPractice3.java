package DsaFundamentals.ControlFlow;

public class LoopsPractice3 {
    public static void main(String[] args) {
        // P1
        int n1 = 10;
        int n2 = 5;
        int lcm = Math.max(n1, n2);
        while (lcm % n1 != 0 || lcm % n2 != 0) {
            lcm += Math.max(n1, n2);
        }
        System.out.println("LCM = " + lcm);

        // P2
        int a = 36;
        int b = 45;
        int hcf = Math.min(a, b);
        while (a % hcf != 0 || b % hcf != 0) {
            hcf--;
        }
        System.out.println("HCF = " + hcf);

        // or Euclides
        /**
         * NWD(max, min) = NWD(min, max % min)
         * czyli z automatu na warsztat bierzemy mniejsze liczby bo wyrzucamy max
         * i dodatkowo progresywnie iteracyjnie je zmniejszamy,
         * dążąc do momentu gdy reszta z dzielenia będzie równa 0,
         * ponieważ wtedy to oznacza, że poprzednia reszta,
         * przez którą dzieliliśmy min (co daje ten sam efekt jak w przypadku szukania NWD max i min,bo te działania mają to samo NWD),
         * jest NWD min i (max%min) co daje również NWD max i min.
         * Czyli możemy zmniejszać zakres otrzymując ten sam wynik NWD
         * jak w przypadku obliczania klasycznego NWD dla max i min,
         * więc algorytm jest bardziej wydajny.
         */
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int mod;
        while ((mod = max % min) != 0) {
            max = min;
            min = mod;
        }
        System.out.println("Euclides HCF = " + min);

        // P3
        int num = 31;
        System.out.println(num + (isArmstrong(num) ? " is " : " is not ") + "an Armstrong number.");

        // P4
        int range = 1000;
        for (int i = 0; i < range; i++) {
            if (isArmstrong(i)) System.out.print(i + ", ");
        }
    }

    private static boolean isArmstrong(int num) {
        int numOperator = num;
        int digits = Integer.toString(num).length();
        int sum = 0;

        int[] powers = new int[10];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(i, digits);
        }

        while (numOperator > 0) {
            int currDigit = numOperator % 10;
            sum += powers[currDigit];
            numOperator /= 10;
        }
        return sum == num;
    }
}
