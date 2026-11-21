public class Main{
    public static void main(String [] args){
        int a=2;
        int b=3;
        System.out.println("Bienvenue");
        System.out.println(a+" * "+b+" = "+Operation.multiply(a,b));
        System.out.println(a+" + "+b+" = "+Operation.add(a,b));
        System.out.println(a+" - "+b+" = "+Operation.sub(a,b));
        System.out.println(a+" / "+b+" = "+Operation.division(a,b));
    }
}