public class TriangleServiceImpl implements TriangleService {

    @Override
    public double calculateArea(Triangle triangle) {
        checkIfExists(triangle);
        double semiPerimeter = calculatePerimeter(triangle) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getA()) * (semiPerimeter - triangle.getB()) * (semiPerimeter - triangle.getC()));
    }

    @Override
    public double calculatePerimeter(Triangle triangle) {
        checkIfExists(triangle);
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    @Override
    public String getType(Triangle triangle) {
        checkIfExists(triangle);

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

    private void checkIfExists(Triangle triangle) {
        if (!(triangle.getA() + triangle.getB() > triangle.getC()
                && triangle.getA() + triangle.getC() > triangle.getB()
                && triangle.getB() + triangle.getC() > triangle.getA())) {
            throw new RuntimeException("Invalid arguments");
        }
    }
}
