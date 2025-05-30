package FortuneCookieLab;

import java.util.Objects;
import java.util.Scanner;

public class Fortune {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FCArrayList fca = new FCArrayList();

        System.out.println("Welcome to the Fortune Machine. ");
        System.out.println("Consider the following choices and enter a number 1-8: ");
        System.out.println("1. Add a Fortune ");
        System.out.println("2. Peek at a Fortune ");
        System.out.println("3. Look at a specific Fortune ");
        System.out.println("4. Grab the first Fortune on top ");
        System.out.println("5. Remove a specific Fortune ");
        System.out.println("6. Count Fortunes ");
        System.out.println("7. Print Fortunes ");
        System.out.println("8. Quit Fortune Machine ");

        do {
            if (Objects.equals(sc.nextLine(), "1")) {
                System.out.println("Enter the index you want to add: ");
                int ind = Integer.valueOf(sc.nextLine());
                System.out.println("Enter the element you want to add to that index: ");
                int elm = Integer.valueOf(sc.nextLine());

                fca.add(elm, ind);

                System.out.println("Your fortune is now: " + fca.toString());
                System.out.println("Please consider another choice and enter a number 1-8: ");
            }

            if (Objects.equals(sc.nextLine(), "2")) {
                System.out.println("The first cookie in your fortune is: " + fca.peek());
                System.out.println("Please consider another choice and enter a number 1-8: ");

            }

            if (Objects.equals(sc.nextLine(), "3")){
                System.out.println("Enter the index you want to look at: ");
                int ind = Integer.valueOf(sc.nextLine());
                System.out.println(fca.getFortune(ind));
                System.out.println("Please consider another choice and enter a number 1-8: ");

            }

            if (Objects.equals(sc.nextLine(), "4")){
                System.out.println("The first fortune on top is: " + fca.getFortune(0));
                System.out.println("Please consider another choice and enter a number 1-8: ");
            }

            if (Objects.equals(sc.nextLine(), "5")){
                System.out.println("Enter the index you would like to remove: ");
                int ind = Integer.valueOf(sc.nextLine());
                fca.remove(ind);
                System.out.println("Your fortune now is: " + fca.toString());
                System.out.println("Please consider another choice and enter a number 1-8: ");
            }

            if (Objects.equals(sc.nextLine(), "6")){
                System.out.println("The size of your fortune is: " + fca.size());
                System.out.println("Please consider another choice and enter a number 1-8: ");
            }

            if (Objects.equals(sc.nextLine(), "7")){
                System.out.println(fca.toString());
            }

            } while (Objects.equals(sc.nextLine(), "8") == false);

        sc.close();
    }
}
