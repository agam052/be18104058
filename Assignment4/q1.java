class MyException extends Exception {
    private static int account_numbers[] = { 101, 102, 103, 104, 105,106,107,108 };
    private static String customer_names[] = { "Agam", "Alkesh", "Shashwat", "Ram", "Raj", "Akshat", "Rajan", "Vishesh" };
    private static double balance_amounts[] = { 1000.00, 2000.00, 3290.50, 999.00, 134.45, 5657.32, 8785.15, 781.30 };

    MyException() {
    }

    MyException(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("DETAILS OF THE CUSTOMERS");
            for (int i = 0; i < 8; i++) {
                System.out.println(account_numbers[i] + "\t" + customer_names[i] + "\t" + balance_amounts[i]);
                if (bal[i] < 1000) {
                    MyException e = new MyException("Balance amount is less");
                    throw e;
                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}