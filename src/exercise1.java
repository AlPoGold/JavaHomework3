import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class exercise1 {

    /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = randomList(10, 1, 10);
        System.out.println(list);
        listOddNum(list);
        System.out.println(list);

    }

    static ArrayList<Integer> randomList(int size, int min, int max){
        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(min, max+1));
        }
        return randomList;
    }

    static void listOddNum(List<Integer> list){

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();
            if(element%2==0){
                iterator.remove();
            }
        }


    }
}
