package lesson03.b_composition;
import lesson03.b_composition.Color;

public class Truck extends Car {
    //private static final Engine engine = ;

    Truck(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    Truck(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }


    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{} extends + " + super.toString();
    }


}
