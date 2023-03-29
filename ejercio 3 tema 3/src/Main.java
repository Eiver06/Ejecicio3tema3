public class Main {
    public static void main(String[] args) {
        int resultado;
        int a;
        int b;
        int c;
        resultado = suma(a = 16, b = 19, c = 28);
    }

    public static int suma(int a, int b, int c) {
        System.out.println("Suma es: "+ (a+b+c));
        return a + b + c;

    }
}
