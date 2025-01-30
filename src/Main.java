public class Main {
    public static void main(String[] args) {
        TriangleExecutor executor = new TriangleExecutor(new TriangleService());
        Triangle t1 = new Triangle(3, 4, 5);
        executor.execute(t1);
    }
}