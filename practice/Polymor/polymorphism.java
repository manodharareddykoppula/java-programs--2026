class Calculator {
    void calculate() {
        System.out.println("Performing calculation");
    }

    void calculate(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

class ScientificCalculator extends Calculator {
    @Override
    void calculate() {
        System.out.println("Performing scientific calculation");
    }
}

public class Poly {
    public static void main(String[] args) {

        ScientificCalculator sc = new ScientificCalculator();
        sc.calculate();
        sc.calculate(10, 20);
    }
}
