public class Swap {

    public static void main(String[] args) {

        int a = 123;
        int b = 526;

        int temp = a * b;

        a = temp / a;
        b = temp / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
