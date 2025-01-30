public class TriangleExecutor {
    TriangleService triangleService;

    public TriangleExecutor(TriangleService triangleService) {
        this.triangleService = triangleService;
    }

    public void execute(Triangle triangle) {
        this.executePerimetr(triangle);
        this.executeArea(triangle);
        this.executeType(triangle);
    }

    private void executePerimetr(Triangle triangle) {
        System.out.println("Perimetr: " + triangleService.calculatePerimeter(triangle));
    }

    private void executeArea(Triangle triangle) {
        System.out.println("Area: " + triangleService.calculateArea(triangle));
    }

    private void executeType(Triangle triangle) {
        System.out.println("Type: " + triangleService.getType(triangle));
    }
}
