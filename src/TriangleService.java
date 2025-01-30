public class TriangleService {
    Triangle triangle;
    double a;
    double b;
    double c;

    public TriangleService(Triangle triangle) {
        this.triangle = triangle;
        this.a = triangle.getA();
        this.b = triangle.getA();
        this.c = triangle.getA();
    }

    private boolean exists() {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            System.out.println("Triangle is not exist");
            return false;
        }
    }

    public double calculateArea() {
        if (!exists()) return 0.0;
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculatePerimeter() {
        if (!exists()) return 0.0;
        return a + b + c;
    }

    public String getType() {
        if (!exists()) return " ";

        if (a == b && b == c) {
            return "Ravnostoroniy";
        }
        if (a == b || b == c || a == c) {
            return "Ravnobedreniy";
        }
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            return "Pramoygolniy";
        } else {
            return "Proizvolniy";
        }
    }
}