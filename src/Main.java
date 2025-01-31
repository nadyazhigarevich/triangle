import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            TriangleExecutor executor = new TriangleExecutor(new TriangleServiceImpl());
            Triangle t1 = new Triangle(a, b, c);
            executor.execute(t1);
        }
    }
}