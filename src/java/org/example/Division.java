package java.org.example;

public class Division {
    private int a;
    private int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void dividir() {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
