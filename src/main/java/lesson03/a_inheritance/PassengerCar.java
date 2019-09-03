package lesson03.a_inheritance;

public class PassengerCar extends Car {
    public PassengerCar(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    @Override
    public String getType() {
        return "Passenger car";
    }


}
