package org.example.methods.shapeRefactor;

import java.util.List;

public class ShapeCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
            if (shapes == null || shapes.size() == 0) {
                return totalArea;
            }

            for(Shape shape : shapes){
                if(shape != null){
                    totalArea += shape.calculateArea();
                }
            // Add more conditions for other shapes (e.g., Triangle)
        }
        return totalArea;
    }
}
