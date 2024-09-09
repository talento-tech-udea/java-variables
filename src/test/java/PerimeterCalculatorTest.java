import org.junit.jupiter.api.Test;
import org.talento.tech.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimeterCalculatorTest {

    public Shape loadShape() {
        Shape shape = new Shape();
        shape.readPoints("square.txt");
        return shape;
    }

    @Test
    void calculatePerimeterTest() {
        Shape shape = loadShape();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        double perimeter = perimeterCalculator.calculatePerimeter(shape);
        assertEquals(16.0, perimeter);
    }

    @Test
    void totalPointsTest() {
        Shape shape = loadShape();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        int totalPoints = perimeterCalculator.getTotalPoints(shape);
        assertEquals(4, totalPoints);
    }
}
