import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class exercise2 {

    /*
    Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = exercise1.randomList(20, 1, 45);
        System.out.println(list.toString());
        System.out.printf("The maximum of this array is %d", Collections.max(list));
        System.out.print("\n");
        System.out.printf("The minimum of this array is %d", Collections.min(list));
        System.out.print("\n");
        double average = (double) sumList(list) /list.size();
        System.out.printf("The average of this array is %.2f", average);

    }

    static int sumList(ArrayList<Integer> list){
        int sum=0;
        for (int elem:list) {
            sum+=elem;
        }
        return sum;
    }
}
