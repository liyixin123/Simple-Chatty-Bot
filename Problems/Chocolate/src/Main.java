import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int target = scanner.nextInt();
        int rest = row * col - target;
        if ((rest % row == 0 || rest % col == 0) && rest >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}