package advance;

public abstract class Calculator {

    void calculate(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    abstract void div(int a, int b);
}
