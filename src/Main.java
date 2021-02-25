public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int count = 1100;
        int bonus;
        int totalbalance;

        if (count > 1000) {
             bonus = count / 100;
             totalbalance = balance + count + bonus;
        } else {
            bonus = 0;
            totalbalance = balance + count;
        }
        System.out.println(bonus);
        System.out.println(totalbalance);


    }
}
