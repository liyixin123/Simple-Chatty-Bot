import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        double persent = scanner.nextInt() * 0.01;
        int k = scanner.nextInt();
        int year = 0;
        while (money < k) {
            money = money * (1 + persent);
            year++;
        }
        System.out.println(year);
    }
}