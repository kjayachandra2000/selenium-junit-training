package advance;

public class Customer {
    public static void main(String[] args) {

        Bank1 bank1 = new Bank1();
        bank1.calculate(5, 4);
        bank1.sub(5, 6);


        Bank2 bank2 = new Bank2();

        bank2.calculate(4, 6);
        bank2.sub(5, 6);
    }
}
