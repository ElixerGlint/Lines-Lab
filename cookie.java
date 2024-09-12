import java.util.Scanner;
//spam protection

public class cookie {
    public static void main(String[] args) {
        System.out.println("Welcome to cookie clicker");
        Scanner input;
        input = new Scanner(System.in);
        String newcookie;
        int cookies = 0;
        String enterkey = "Press enter for a cookie!";
        while (true) {
            enterkey = input.nextLine();

            if (enterkey.equals("")) {
                System.out.println("You gained a cookie!");
                cookies += 1;
            }
            System.out.println("You have " + cookies + " cookies!");
        }
    }
}
