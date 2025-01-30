import java.io.EOFException;

public class TriangleService {

    private boolean exists(Triangle triangle) {
        if (triangle.getA() + triangle.getB() > triangle.getC()
                && triangle.getA() + triangle.getC() > triangle.getB()
                && triangle.getB() + triangle.getC() > triangle.getA()) {
            return true;
        } else {
            System.out.println("Triangle is not exist");
            throw new RuntimeException("Invalid arguments");
        }
    }

    public double calculateArea(Triangle triangle) {
        if (!exists(triangle)) return 0.0;
        double semiPerimeter = calculatePerimeter(triangle) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getA()) * (semiPerimeter - triangle.getB()) * (semiPerimeter - triangle.getC()));
    }

    public double calculatePerimeter(Triangle triangle) {
        if (!exists(triangle)) return 0.0;
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public String getType(Triangle triangle) {
        if (!exists(triangle)) return " ";

        if (triangle.getA() == triangle.getB()
                && triangle.getB() == triangle.getC()) {
            return TriangleType.EQUILATERAL.name();
        }
        if (triangle.getA() == triangle.getB()
                || triangle.getB() == triangle.getC()
                || triangle.getA() == triangle.getC()) {
            return TriangleType.ISOSCELES.name();
        }
        if (Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2) == Math.pow(triangle.getC(), 2)
                || Math.pow(triangle.getA(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getB(), 2)
                || Math.pow(triangle.getB(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getA(), 2)) {
            return TriangleType.RECTANGULAR.name();
        } else {
            return TriangleType.ARBITRARY.name();
        }
    }
}