import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double massivNomber [] = { 2.5,-5.1,-2.8,3.5,9.4,-6.1,3.9,-8.8,9.7,-1.5,4.1,2.1,3.1,-6.1,2.5};
        for (int i = 0; i <= massivNomber.length; i++) {
            ;
        }
        System.out.println(Arrays.toString(massivNomber));
        System.out.println(mid(massivNomber));
    }
    public static double mid(double[] numbers) {
        double grade = 0;

        for (double num : numbers) {
            grade = num + grade;
        }
        return ((double) grade / numbers.length);

    }
}