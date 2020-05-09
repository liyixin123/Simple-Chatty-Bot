import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grade = new int[4];
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            grade[score - 2]++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(grade[i] + " ");
        }
    }
}