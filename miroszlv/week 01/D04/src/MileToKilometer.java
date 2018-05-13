import java.util.Scanner;

public class MileToKilometer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int inputKm = scanner.nextInt();
                inputKm *= 0.6213 ;

        System.out.println("It's around " + inputKm + "miles");
    }
}
