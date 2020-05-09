import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dif = 0;
        boolean difInit = false;
        while (n != 0) {
            int n2 = scanner.nextInt();
            if (n2 == 0) {
                System.out.println("true");
                break;
            }
            if (!difInit) {
                difInit = true;
                dif = n2 - n;
                n = n2;
                continue;
            }
            if (dif * (n2 - n) < 0) {
                System.out.println("false");
                break;
            }
            if ((n2 - n) != 0) {
                dif = n2 - n;
            }
            n = n2;
        }
    }
}