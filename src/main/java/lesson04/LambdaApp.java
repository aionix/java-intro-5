package lesson04;

public class LambdaApp {
    public static void main(String[] args) {
        int[] array = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};

        Expression exp1 = el -> el%2 == 0;

        Expression exp2 = ExpUtils::isNegative;
        Expression exp3 = ExpUtils::isPositive;

        System.out.println(sumOf(array, exp1));
        System.out.println(sumOf(array, exp2));
        System.out.println(sumOf(array, exp3));

    }

    private static int sumOf(int[] array, Expression func){
        int sum = 0;
        for (int el : array){
            if (func.isTrue(el)){
                sum += el;
            }
        }return sum;
    }
}
