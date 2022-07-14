import java.util.Scanner;
public class StylizedCupcakeCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String order = input.nextLine();
        int numCake = 0, price = 0, minOrder = 0, newPrice = 0;
        String[] orders = order.split(" ");
        if (orders[0].charAt(0) == 't') {
            numCake = Integer.parseInt(orders[0].substring(2));
        }
        if (orders[0].charAt(0) == 'D') {
            newPrice = Integer.parseInt(orders[0].substring(2));
        }
        if (orders[0].charAt(0) == 'k') {
            minOrder = Integer.parseInt(orders[0].substring(2));
        }
        if (orders[0].charAt(0) == 'd') {
            price = Integer.parseInt(orders[0].substring(2));
        }
        if (orders[1].charAt(0) == 't') {
            numCake = Integer.parseInt(orders[1].substring(2));
        }
        if (orders[1].charAt(0) == 'D') {
            newPrice = Integer.parseInt(orders[1].substring(2));
        }
        if (orders[1].charAt(0) == 'k') {
            minOrder = Integer.parseInt(orders[1].substring(2));
        }
        if (orders[1].charAt(0) == 'd') {
            price = Integer.parseInt(orders[1].substring(2));
        }
        if (orders[2].charAt(0) == 't') {
            numCake = Integer.parseInt(orders[2].substring(2));
        }
        if (orders[2].charAt(0) == 'D') {
            newPrice = Integer.parseInt(orders[2].substring(2));
        }
        if (orders[2].charAt(0) == 'k') {
            minOrder = Integer.parseInt(orders[2].substring(2));
        }
        if (orders[2].charAt(0) == 'd') {
            price = Integer.parseInt(orders[2].substring(2));
        }
        if (orders[3].charAt(0) == 't') {
            numCake = Integer.parseInt(orders[3].substring(2));
        }
        if (orders[3].charAt(0) == 'D') {
            newPrice = Integer.parseInt(orders[3].substring(2));
        }
        if (orders[3].charAt(0) == 'k') {
            minOrder = Integer.parseInt(orders[3].substring(2));
        }
        if (orders[3].charAt(0) == 'd') {
            price = Integer.parseInt(orders[3].substring(2));
        }

        int totalPrice;
        if (numCake >= minOrder) {
            totalPrice = newPrice * numCake;
        } else {
            totalPrice = numCake * price;
        }
        String total = Integer.toString(totalPrice);
        for (int i = 0; i < total.length()+8; i++) {
            System.out.print("*");

        }

        System.out.println("\n" + totalPrice + " Dollars");
        for (int i = 0; i < total.length()+8; i++) {
            System.out.print("*");
        }
 }
}
