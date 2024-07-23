package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bubbleGumIncome = 202;
        int  toffeeIncome = 118;
        int iceCreamIncome = 2250;
        int milkChocolateIncome = 1680;
        int doughnutIncome = 1075;
        int pancakeIncome = 80;
        int sumIncome = bubbleGumIncome + toffeeIncome + iceCreamIncome + milkChocolateIncome + doughnutIncome
                + pancakeIncome;


        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubbleGumIncome);
        System.out.println("Toffee: $" + toffeeIncome);
        System.out.println("Ice Cream: $" + iceCreamIncome);
        System.out.println("Milk Chocolate: $" + milkChocolateIncome);
        System.out.println("Doughnut: $" + doughnutIncome);
        System.out.println("Pancake: $" + pancakeIncome);
        System.out.println("Income: $" + sumIncome);
        System.out.println("Staff expenses?");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses?");
        int otherExpenses = scanner.nextInt();
        int netIncome = sumIncome - staffExpenses -otherExpenses;
        System.out.println("Net income: $" + netIncome);
    }
}