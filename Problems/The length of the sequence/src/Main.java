import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 0) {
            n++;
            a = scanner.nextInt();
        }
        System.out.println(n);
    }
}