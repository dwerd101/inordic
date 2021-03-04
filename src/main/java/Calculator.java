public class Calculator {
    public int min(int a, int b) {
        return a - b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(5,4));
    }
}

