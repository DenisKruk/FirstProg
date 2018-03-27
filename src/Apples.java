public class Apples {
    public static void main(String[] args) {
        int applesTotal = 15;
        int applesPete = 10;
        int applesVasia = calculate(applesTotal, applesPete);
        int print = print(applesVasia);
    }

    public static int calculate(int applesTotal, int applesPete) {
        return applesTotal - applesPete;
    }

    public static int print(int applesVasia) {
        System.out.println(applesVasia);
        return applesVasia;
    }

}
