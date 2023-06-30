
import java.lang.reflect.Array;
import java.util.*;

public class exercise3 {

    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке
     */

    public static void main(String[] args) {
        String[] planetsArray = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> planets = new ArrayList<>();
        planets.addAll(Arrays.asList(planetsArray));
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please, enter the size of new list with planets\nNOTE: for correct result enter number mote than 15! ");
        System.out.println("Your number: ");
        int size = scan.nextInt();
        ArrayList<String> randomPlanets = getRandomElement(planets, size);

        boolean flag = checkDiversity(randomPlanets, planetsArray);
        while(!flag){
            System.out.println("Sorry, its not enough for random list. We will increase your number with 2");
            size+=2;
            randomPlanets = getRandomElement(planets, size);
            flag = checkDiversity(randomPlanets, planetsArray);

        }
        System.out.println(randomPlanets);
        countPlanets(randomPlanets, planetsArray);

    }



    static ArrayList<String> getRandomElement(ArrayList<String> list, int size)
    {
        Random random = new Random();
        ArrayList<String> tempList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(list.size());
            String elem = list.get(randomIndex);
            tempList.add(elem);
        }
        return tempList;
    }

    static boolean checkDiversity(ArrayList<String> list, String[] array){
       int count = 0;
       int size = array.length;
        for ( String elem: array) {
            if (list.contains(elem)) {
                count+=1;

            }
        }
        return count==size;
    }

    static void countPlanets(ArrayList<String> list, String[] array){
        for (String elem: array) {
            int countPlanet = Collections.frequency(list, elem);
            System.out.printf("Планета %s встречается %d раз в списке", elem ,countPlanet);
            System.out.println();

        }
    }
}
