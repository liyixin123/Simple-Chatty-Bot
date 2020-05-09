import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean condition1 = a > 0;
        boolean condition2 = b > 0;
        boolean condition3 = c > 0;
        boolean oneOrAllCorrect = condition1 ^ condition2 ^ condition3;
        boolean allCorrect = condition1 && condition2 && condition3;

        System.out.println(oneOrAllCorrect && !allCorrect);
    }
}