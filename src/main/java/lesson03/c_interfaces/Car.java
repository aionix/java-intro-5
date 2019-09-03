package lesson03.c_interfaces;
import lesson03.b_composition.Color;
import lesson03.b_composition.Engine;

import java.util.Objects;

public abstract class Car {
    private String manufacturer;
    private int produceYear;
    private Color color;
    private Engine engine;

    public Car(String manufacturer, int produceYear, Color color) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
    }

    public Car(String manufacturer, int produceYear, Color color, Engine engine) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
        this.engine = engine;
    }

    abstract String getType();

    public void gas() {
        engine.startEngine();
        System.out.println(getType() + " started to move");
    }

    public void stop() {
        System.out.println(getType() + " started to stop");
        System.out.println(getType() + " stopped");
        engine.stopEngine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return produceYear == car.produceYear &&
                Objects.equals(manufacturer, car.manufacturer) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, produceYear, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", produceYear=" + produceYear +
                ", color=" + color +
                '}';
    }
}
