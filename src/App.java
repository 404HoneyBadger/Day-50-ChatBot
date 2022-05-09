import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        name();
        sleep(1000);
        game();
        sleep(1000);
        firstQ();
        sleep(1000);
        counting();
        sleep(1000);
        knowledge();
    }

    public static void name() {
        System.out.println("Heya!");
        sleep(1000);
        System.out.println("Can you tell me your name?");
        String name1 = (scanner.nextLine());
        sleep(1000);
        System.out.println("Nice to meet you " + name1 + "!");
    }

    public static void game() {
        System.out.println("Let's play a game!");
        sleep(1000);
        System.out.println("I'm going to guess your age based on a question about a catastrophic event.");
        sleep(1000);
    }

    public static boolean firstQ() {
        System.out.println("Where you in elementary school during 9/11? Enter true or false.");
        boolean nine11 = scanner.nextBoolean();
        if (nine11 == true) {
            System.out.println("Ok, you're Gen Z");
            sleep(1000);
            System.out.println("I'm gonna guess your age now!");
            sleep(1000);
            int guess = (int) ((Math.random() * (.25 - .09) + .09) * 100);
            System.out.println("You are " + guess + "!");
        } else {
            System.out.println("Ok, you're a Millennial");
            sleep(1000);
            System.out.println("I'm gonna guess your age now!");
            sleep(1000);
            int guess = (int) ((Math.random() * (.41 - .26) + .26) * 100);
            System.out.println("You are " + guess + "!");
        }
        return nine11;
    }

    public static void counting() {
        System.out.println("Enter a number so I can count for you :)");
        int num2 = scanner.nextInt();
        int i = 0;
        while (i <= num2) {
            System.out.println(i);
            sleep(300);
            i++;
        }
        sleep(300);
        System.out.println("Yay we counted to " + num2 + "!");
    }

    public static void knowledge() {
        System.out.println("Lets test your programming knowledge! Enter 'a', 'b', 'c' or 'd'.");
        sleep(1000);
        System.out.println("What is stored in the triangle array?");
        sleep(1000);
        System.out.println("let point = [1,3], segment = [point,[5,5]], triangle = [...segment,[1,8]];");
        sleep(1000);
        System.out.println("(a) SyntaxError");
        System.out.println("(b) [1,3,5,5, [1,8 ] ]");
        System.out.println("(c) [ [1,3], [5,5], [1,8] ]");
        System.out.println("(d) undefined");
        String answer = scanner.nextLine();
        
        while (!answer.equalsIgnoreCase("c")) {
            System.out.println("Nope! Let's try again");
            System.out.println("What is stored in the triangle array?");
            sleep(1000);
            System.out.println("let point = [1,3], segment = [point,[5,5]], triangle = [...segment,[1,8]];");
            sleep(1000);
            System.out.println("(a) SyntaxError");
            System.out.println("(b) [1,3,5,5, [1,8 ] ]");
            System.out.println("(c) [ [1,3], [5,5], [1,8] ]");
            System.out.println("(d) undefined");
            answer = scanner.nextLine(); 
        }
        System.out.println("Great Job! Much Learn! A++");
    }

    static Scanner scanner = new Scanner(System.in);

    private static void sleep(long millies) {
        try {
            Thread.sleep(millies);
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
