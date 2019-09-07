package lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsHomeWork {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lexus");


        cars.remove("BMW");
        System.out.println(cars.contains("BMW"));

        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }

        Collections.sort(cars);
        System.out.print(" =====>sorted====> ");

        Iterator iterator2 = cars.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next()+ " ");
        }

    }
}
