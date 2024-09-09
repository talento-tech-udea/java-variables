import org.talento.tech.*;

import java.util.List;

public class PerimeterCalculator {

    public PerimeterCalculator () {}

    public double calculatePerimeter(Shape s) {
        double perimeter = 0.0;

        List<Point> points = s.getPoints();
        Point prevPoint = points.getLast();

        for (Point point : points) {
            double currDist = prevPoint.distancia(point);
            perimeter += currDist;

            prevPoint = point;
        }

        return perimeter;
    }

    public int getTotalPoints(Shape s) {
        int totalPoints = 0;
        for(Point point: s.getPoints()) {
            totalPoints += 1;
        }

        return totalPoints;
    }

    public static void main (String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        String fileName = "square.txt";
        Shape shape = new Shape();
        shape.readPoints(fileName);
        double perimeter = perimeterCalculator.calculatePerimeter(shape);
        System.out.println("Perimeter: " + perimeter);
        int totalPoints = perimeterCalculator.getTotalPoints(shape);
        System.out.println("Total points: " + totalPoints);
    }
}
