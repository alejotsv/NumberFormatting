public class NumberFormatting {
    public static void main(String[] args) {
        int balance = 5000;
        System.out.println("Balance without formatting: " + balance);
        System.out.format("Balannce with formatting: $%,d%n", balance);
        System.out.format("%.5f", Math.PI);
    }
}
