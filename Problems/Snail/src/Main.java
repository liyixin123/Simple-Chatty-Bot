import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a;
        int day = 1;
        while (sum < h) {
            sum -= b;
            day++;
            sum += a;
        }
        System.out.println(day);
    }
}