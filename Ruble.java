public class Ruble {
    public static void main(String[] args) {
        long amount = 700;
        long sum = 6000;
        long bonus;
        if (sum >= 1000) {
            bonus = (amount + sum) / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
