//package test123;
import java.util.Scanner;
public class testasddasd {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String name; // Declaring a variable
		int age;
		double money = 0;
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("What is your name? ");
		name = input.next();
		System.out.print(name + " is your name!" + "\n"); // sysout then ctrl space
		System.out.print("How old are you? ");
		age = input.nextInt();
		System.out.print("You are " + age + " years old. \n");
		System.out.print("How much cash you got on you? ");
		money = input.nextDouble();
		System.out.println("Nice to meet you, " + name + "!!");
		System.out.print("$" + money + " is a lot of money for someone who is " + age + " years old \n\n\n");
		boolean hasEnoughMoney = false;
		double cashDrawer = 100;
		if (money >= 10) {
			hasEnoughMoney = true;
		}
		if (hasEnoughMoney) {
			System.out.print(
					"Welcome to my bake sale! I can see you have enough money to buy a product. Buy these brownies!");
			// sales techniqe that is foolproof
			cashDrawer += 10;
			money -= 10;
		} else if (money >= 5) { // less money
			System.out.print("Broke boy broke boy broke broke broke boy\n");
			System.out.print("hello broke boy, take a cookie for 5$\n");
			cashDrawer += 5;
			money -= 5;
		} else {
			if (age < 10 && age < 80)
				System.out.print("YOUR BROKE. *Whips out the hose* NO LOITERING\n");
		}
		System.out.print("I ended the day with " + cashDrawer + "$\n");
		System.out.print("You ended the day with " + money + "$\n");
		input.close();
	}
}



