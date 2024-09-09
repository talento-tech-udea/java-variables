import org.talento.tech.*;

import java.util.List;

/**
 * Este codigo permite calcular el perimetro de figuras de N >= 3 lados
 * Figuras de ejemplo:
 * - square.txt - lado de 4
 * - triangle.txt - base de 4, altura de 4
 */

public class PerimeterCalculator {

    public PerimeterCalculator () {}

    public double calculatePerimeter(Shape s) {
        // Definir la variable que acumule el perimetro

        List<Point> points = s.getPoints();
        Point prevPoint = points.getLast();

        for (Point point : points) {
            // Obtener la distancia de los lados
            // Ayuda: prevPoint.distancia(point)

            prevPoint = point;
        }

        // Retornar la variable del perimetro
    }

    public int getTotalPoints(Shape s) {
        // Definir la variable para el total de puntos
        for(Point point: s.getPoints()) {
            // Acumular el total de puntos
        }

        // Retornas el valor de puntos
    }

    public static void main (String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        // Definit el nombre del archivo
        Shape shape = new Shape();

        shape.readPoints("nombre_archivo");
        // Mostrar el valor de calculatePerimeter y getTotalPoints
    }
}
