package lesson04;

public class ExpUtils {

    static boolean isPositive(int el){
        return el >=0;
    }

    static boolean isNegative(int el){
        return !ExpUtils.isPositive(el);
    }
}
