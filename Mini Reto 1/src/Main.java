import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 24, -3, 36, 8, 17, 55};
        Challenge1 solution = new Challenge1(numbers);

        // First challenge
        System.out.println(solution.randomNumber("TipoA"));
        System.out.println(solution.randomNumber("TipoB"));

        // Second challenge
        solution.sortNumbers(numbers, "Asc");
        solution.print(numbers);
        solution.sortNumbers(numbers, "Desc");
        solution.print(numbers);
    }
}