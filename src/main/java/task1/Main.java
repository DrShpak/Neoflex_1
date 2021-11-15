package task1;

public class Main {

    /**
     * task 1
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * task 2
     */
    private static void init() {
        int a = 10;
        double b = 10.0d;
        boolean c = true;
        char d = 'c';
        float e = 10.0f;
        byte f = 8;
        short g = 127;
        long h = 516L;
        String i = "string";
        Object j = new Object();
    }

    /**
     * task 3
     * @param a param 1
     * @param b param 2
     * @param c param 3
     * @param d param 4
     * @return result of calculation
     */
    private static double calc(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    /**
     * task 4
     * @param a first num
     * @param b second num
     * @return true if sum >= 10 and sum <= 20
     */
    private static boolean isInRange(double a, double b) {
        return a + b >= 10 && a + b <= 20;
    }


    /**
     * task 5
     * @param num number to check
     */
    private static void isPositive(int num) {
        if (num >= 0)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");
    }


    /**
     * task 6
     * @param num number to check
     * @return true if num is negative
     */
    private static boolean isNegative(int num) {
        return num < 0;
    }

    /**
     * task 7
     * @param name name to print
     */
    private static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }


    /**
     * task 8
     * @param year year to check
     */
    private static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}