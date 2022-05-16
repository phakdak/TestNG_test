public class Main {
    public static void main(String[] args) {

        System.out.println(mul(sub(1,2), fact(5)));
    }

    //addision of two numbers
    public static int add(int a, int b) {
        System.out.println(a+b);
        return a + b;

    }

    //subtraction of two numbers
    public static int sub(int a, int b) {
        System.out.println(a-b);
        return a - b;
    }

    //multiplication of two numbers
    public static int mul(int a, int b) {
        System.out.println(a*b);
        return a * b;
    }

    //division of two numbers
    public static int div(int a, int b) {
        System.out.println(a/b);
        return a / b;
    }

    //modulus of two numbers
    public static int mod(int a, int b) {
        System.out.println(a%b);
        return a % b;
    }
    // factorial of a number
    public static int fact(int a) {
        int fact = 1;
        for(int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;
    }
}
