package org.talento.tech;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Shape {
    public List<Point> points = new ArrayList<>();

    public Shape(){}

    public void readPoints(String file) {
        ClassLoader classLoader = getClass().getClassLoader();

        URL resourceURL = classLoader.getResource(file);

        if (resourceURL != null) {
            Path resourcePath = Paths.get(resourceURL.getPath());

            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(resourcePath.toString()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String linea;
            while (true) {
                try {
                    if ((linea = reader.readLine()) == null) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                String[] coordinated = linea.split(" ");
                double x = Double.parseDouble(coordinated[0]);
                double y = Double.parseDouble(coordinated[1]);
                points.add(new Point(x, y));
            }
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Point> getPoints() {
        return points;
    }
}
