public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        System.out.println("Bienvenue");

        System.out.println(a + " * " + b + " = " + Operation.multiply(a, b));
        System.out.println(a + " + " + b + " = " + Operation.add(a, b));
        System.out.println(a + " - " + b + " = " + Operation.sub(a, b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + Operation.division(a, b));
        } else {
            System.out.println("Erreur : division par zéro impossible !");
        }
    }
}