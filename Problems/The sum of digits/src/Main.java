import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n / 100;
        n %= 100;
        sum += n / 10;
        n %= 10;
        sum += n;
        System.out.println(sum);
    }

}