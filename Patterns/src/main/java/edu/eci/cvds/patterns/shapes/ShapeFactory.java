package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;
import java.util.HashMap;
import java.util.Map;


public class ShapeFactory {
    
    public static Shape create(RegularShapeType type) {
        Shape shape = null;
        switch (type) {
            case Triangle:{
                shape = new Triangle();
                return shape;
            }
            case Quadrilateral:{
                shape = new Quadrilateral();
                return shape;
            }
            case Pentagon:{
                shape = new Pentagon();
                return shape;
            }
            case Hexagon:{
                shape = new Hexagon();
                return shape;
            }
        }
        return shape;
    }
        
}

