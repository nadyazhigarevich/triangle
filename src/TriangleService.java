public class TriangleService {

    private boolean exists(Triangle triangle) {
        if (triangle.getA() + triangle.getB() > triangle.getC() && triangle.getA() + triangle.getC() > triangle.getB() && triangle.getB() + triangle.getC() > triangle.getA()) {
            return true;
        } else {
            System.out.println("Triangle is not exist");
            return false;
        }
    }

    public double calculateArea(Triangle triangle) {
        if (!exists(triangle)) return 0.0;
        double s = calculatePerimeter(triangle) / 2;
        return Math.sqrt(s * (s - triangle.getA()) * (s - triangle.getB()) * (s - triangle.getC()));
    }

    public double calculatePerimeter(Triangle triangle) {
        if (!exists(triangle)) return 0.0;
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public String getType(Triangle triangle) {
        if (!exists(triangle)) return " ";

        if (triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC()) {
            return "Ravnostoroniy";
        }
        if (triangle.getA() == triangle.getB() || triangle.getB() == triangle.getC() || triangle.getA() == triangle.getC()) {
            return "Ravnobedreniy";
        }
        if (Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2) == Math.pow(triangle.getC(), 2) ||
                Math.pow(triangle.getA(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getB(), 2) ||
                Math.pow(triangle.getB(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getA(), 2)) {
            return "Pramoygolniy";
        } else {
            return "Proizvolniy";
        }
    }
}