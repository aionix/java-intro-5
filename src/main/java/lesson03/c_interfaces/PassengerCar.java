package lesson03.c_interfaces;

import lesson03.b_composition.Car;
import lesson03.b_composition.Color;
import lesson03.b_composition.Engine;

public class PassengerCar extends Car {
    // aggregation
    //private Person[] passengers;

    public PassengerCar(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }




    @Override
    protected String getType() {
        return "Passenger car";
    }

    @Override
    public String toString() {
        return "PassengerCar{} extends " + super.toString();
    }

}
