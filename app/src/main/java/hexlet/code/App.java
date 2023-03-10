package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import static java.lang.System.out;

class App {
    public static void main(String[] args) {
        out.println("Please enter the game number and press Enter.");
        out.println("1 - Greet");
        out.println("2 - Even");
        out.println("3 - Calculator");
        out.println("4 - GCD");
        out.println("5 - Progression");
        out.println("6 - Prime");
        out.println("0 - Exit");

        var choice = Utils.getInput("Your choice:");

        switch (choice) {
            case "1" -> Engine.greetings();
            case "2" -> Even.startGame();
            case "3" -> Calculator.startGame();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> {
            }
        }

        Utils.closeScanner();
    }
}
