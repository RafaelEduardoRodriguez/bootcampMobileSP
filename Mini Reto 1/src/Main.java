import java.util.Random;

public class Main {

    public static String randomNumber(String in) {
        String number = "";
        Random random = new Random();
        if (in == "TipoA") {
            number += "54";
            for (int i = 1; i <= 8; i++)
                number += Integer.toString(random.nextInt(10));
        } else {
            number += "08";
            for (int i = 1; i <= 8; i++)
                number += Integer.toString(random.nextInt(10));
        }
        return number;
    }

    public static void main(String[] args) {
        // First challenge
        System.out.println(randomNumber("TipoB"));
    }
}