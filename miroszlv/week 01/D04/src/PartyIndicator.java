import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me two number");

        int boys = scanner.nextInt();
        int girls = scanner.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party");
        } else if ((boys + girls > 20 && boys == girls)){
            System.out.println("The party is excellent");
        } else if (boys + girls > 20 && boys != girls) {
            System.out.println("Quite cool party");
        } else if (boys + girls < 20) {
            System.out.println("Average party");
        } else {
            System.out.println("Might be good, might be bad");
        } } }