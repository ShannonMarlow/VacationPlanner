import java.awt.*;
import java.util.Scanner;

public class VacationPlanner {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      Greeting();
      TimeAndBudget();
      TimeDifference();
      CountryArea();
   }
   public static void Greeting(){
       Scanner input = new Scanner(System.in);
       System.out.print("Hello, What is your name? ");
       String name = input.nextLine();
       System.out.print("Lovely to meet you " + name);
       System.out.print(", where are you travelling to? ");
       String destination = input.nextLine();
       System.out.print("Great! " + destination + " sounds like a great trip!");
       System.out.print("\n *****************************");
   }
   public static void TimeAndBudget(){
       Scanner input = new Scanner(System.in);
       System.out.print("\nHow many days are you going to spend travelling? ");
       int days = input.nextInt();
       System.out.print("How much money in, USD, are you planning to spend on your trip? ");
       int cost = input.nextInt();
       System.out.print("What is the three letter currency symbol for your destination? ");
       String currency = input.next();
       System.out.print("How many " + currency + " in 1 USD? ");
       double ExchangeRate = input.nextDouble();
       System.out.print("If you are travelling for " + days + "days, that is the same as " + (days*24) + " hours or " + (days*1440) + " minutes.");
       System.out.print("\nIf you are going to spend " + cost + "USD, that means per day you can spend up to " + (cost/days) + " USD");
       System.out.print("\nYour total budget in " + currency + " is " + (cost*ExchangeRate) + currency + " which is " + (Math.round((cost*ExchangeRate)/days*100.00)/100.00) + currency + " per day");
       System.out.print("\n *****************************");
   }
   public static void TimeDifference(){
       Scanner input = new Scanner(System.in);
       System.out.print("\nWhat is the time difference, in hours, between your home and your destination? ");
       int hours = input.nextInt();
       System.out.print("That means, when it is midnight at home it will be " + hours%24 + ":00 in your travel destination and when it is noon at home it will be " + (hours%24+12) + ":00");
       System.out.print("\n *****************************");
   }
   public static void CountryArea(){
       Scanner input = new Scanner(System.in);
       System.out.print("\nWhat is the square area of your country in km2? ");
       double km = input.nextDouble();
       System.out.print("\nIn miles2 that is " + Math.round(km*0.386*100.00)/100.00);
       System.out.print("\n *****************************");
   }
}
