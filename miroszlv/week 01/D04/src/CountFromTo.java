import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("The second number should be bigger");
        } else if (number2 > number1) {
            for (int i = number1; i < number2 ; i++) {
                System.out.println(i);

            }

        } } }