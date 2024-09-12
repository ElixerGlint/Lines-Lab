import java.util.Scanner;
//spam protection
//test
//heigjag
public class cookie {
    public static void main(String[] args) {
        System.out.println("Welcome to cookie clicker");
        Scanner input;
        input = new Scanner(System.in);
        String newcookie;
        int cookies = 0;
        int prestiges = 0;
        String yesnoprestige;

        String enterkey = "Press enter for a cookie!";
        while (true) {
            enterkey = input.nextLine();
            if (enterkey.equals("")) {
                System.out.println("You gained a cookie!");
                cookies += 1;
            }


            System.out.println("You have " + cookies + " cookies!");

            if(cookies >= 100) {
                System.out.println("You can prestige, would you like to?");
                yesnoprestige = input.nextLine();
                System.out.println("data:");
                System.out.println(yesnoprestige);
                System.out.println(cookies);
                if (yesnoprestige == "1" && cookies > 100) {
                    System.out.println("tasidhasudhuaguiasghuihasuighuias");
                    prestiges++;
                    cookies = 0;
                    System.out.println("You prestiged!");
                }
            }
        }
    }
}
