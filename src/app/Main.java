package app;

public class Main {

    static String productName;
    static double quantity;
    static double price;
    static int days;
    static double totalSales;
    static double dailySales;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        productName = "Smartphone";
        quantity = 20;
        price = 59.99;
        days = 5;
        totalSales = quantity * price;
        dailySales = totalSales / days;
        System.out.printf("Product №1: %s%n", productName);
        System.out.printf("total sales for 5 days is %s %.2f%n", CURRENCY, totalSales);
        System.out.printf("sales by day is %s %.2f%n", CURRENCY, dailySales);

        productName = "Laptop";
        quantity = 15;
        price = 99.99;
        days = 7;
        totalSales = quantity * price;
        dailySales = totalSales / days;
        System.out.printf("Product №2: %s%n", productName);
        System.out.printf("total sales for 7 days is %s %.2f%n", CURRENCY, totalSales);
        System.out.printf("sales by day is %s %.2f%n", CURRENCY, dailySales);

    }
}
