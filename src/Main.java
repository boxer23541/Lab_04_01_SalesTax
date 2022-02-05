public class Main
{

    public static void main(String[] args)
    {
	    double itemPrice = 12.99;
        double tax = itemPrice * 0.05;
        double totalPrice = itemPrice + tax;

        System.out.printf("The item price is $%.2f",itemPrice);
        System.out.printf(" and the tax is $%.2f",tax);
        System.out.printf(" so the total is $%.2f",totalPrice);
    }
}
