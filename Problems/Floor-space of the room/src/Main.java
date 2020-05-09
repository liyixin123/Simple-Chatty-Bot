import java.util.Scanner;

class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String form = scanner.nextLine();
        switch (form) {
            case "triangle":
                calTriangle();
                break;
            case "rectangle":
                calRectangle();
                break;
            case "circle":
                calCircle();
                break;
            default:
                System.out.println("error!");
        }
    }

    static void calTriangle() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static void calRectangle() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(a * b);
    }

    static void calCircle() {
        double r = scanner.nextDouble();
        System.out.println(Math.pow(r, 2) * 3.14);
    }
}