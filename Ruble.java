public class Ruble {
    public static void main(String[] args) {
        long amount = 1000;
        long sum = 6000;
        long bonus;
        if (sum >= 1000) {
            bonus =  sum / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
