import java.util.ArrayList;
import java.util.List;

public class exercise4 {

    /*
     Реализовать алгоритм сортировки слиянием
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = exercise1.randomList(20, 10, 100);
        System.out.println(list.toString());
        ArrayList<Integer> sortList = mergeSort(list);
        System.out.println(sortList);

    }

    static ArrayList<Integer> mergeSort(ArrayList<Integer> list){
        if(list.size()<=1) return list;
        int middle = list.size()/2;
        ArrayList<Integer> subLeftList = new ArrayList<>(list.subList(0, middle));
        ArrayList<Integer> subRightList = new ArrayList<>(list.subList(middle, list.size()));
        ArrayList<Integer> leftList = mergeSort(subLeftList);
        ArrayList<Integer> rightList = mergeSort(subRightList);

        return  merge(leftList, rightList);
    }

    static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right ){
        ArrayList<Integer> sortList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        int leftLen = left.size();
        int rightLen = right.size();

        for (int i = 0; i < leftLen+rightLen; i++) {
            if(leftIndex<leftLen & rightIndex<rightLen){
                if(left.get(leftIndex)<=right.get(rightIndex)){
                    sortList.add(left.get(leftIndex));
                    leftIndex++;
                }else{
                    sortList.add(right.get(rightIndex));
                    rightIndex++;
                }
            }else if(leftLen==leftIndex){
                sortList.add(right.get(rightIndex));
                rightIndex++;
            } else if (rightLen==rightIndex) {
                sortList.add(left.get(leftIndex));
                leftIndex++;
            }
        }
        return sortList;
    }
}
