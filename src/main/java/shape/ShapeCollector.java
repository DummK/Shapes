package shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes =  new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if(shapes.contains(shape)) {
            return shapes.remove(shape);
        }
        else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        return "";
    }
}
