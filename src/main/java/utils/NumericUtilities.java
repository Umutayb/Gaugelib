package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumericUtilities {

    public static void main(String[] args) {        //Sample execution

        NumericUtilities numeric = new NumericUtilities();

        List<Integer> orderedList;
        List<Integer> disorderedList = new ArrayList<>();

        for (int i = 0; i < numeric.randomNumber(0,100); i++) {
            disorderedList.add(numeric.randomNumber(0,100));
        }

        System.out.println("Disordered list is: "+disorderedList);

        orderedList = numeric.listSorter(disorderedList, false);

        System.out.println("Ordered list is: "+orderedList);

        System.out.println("Smallest number is "+numeric.getSmallestInList(orderedList).get("number"));

        System.out.println("Largest number is "+numeric.getLargestInList(orderedList).get("number"));

    }

    public int randomNumber(int min, int max){ //Generates random number in the given margins
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public List<Integer> listSorter(List<Integer> list, boolean larger2smaller){
        List<Integer> orderedList = new ArrayList<>();
        int lnIndex;
        int ln;
        Map<String , Integer> map;
        while (list.size() > 0){
            if (larger2smaller)
                map = getLargestInList(list);

            else
                map = getSmallestInList(list);

            ln = map.get("number");
            lnIndex = map.get("index");
            list.remove(lnIndex);
            orderedList.add(ln);
        }
        return orderedList;
    }

    public Map<String, Integer> getLargestInList(List<Integer> list){
        Map<String, Integer> largestNumberMap = new HashMap<>();
        int largestNumber = 0;
        int largestNumberIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (largestNumber<list.get(i)){
                largestNumber = list.get(i);
                largestNumberIndex = i;
            }
        }
        largestNumberMap.put("number", largestNumber);
        largestNumberMap.put("index", largestNumberIndex);
        return largestNumberMap;
    }

    public Map<String, Integer> getSmallestInList(List<Integer> list){
        Map<String, Integer> largestNumberMap = new HashMap<>();
        int smallestNumber = 999999999;
        int smallestNumberIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (smallestNumber>list.get(i)){
                smallestNumber = list.get(i);
                smallestNumberIndex = i;
            }
        }
        largestNumberMap.put("number", smallestNumber);
        largestNumberMap.put("index", smallestNumberIndex);
        return largestNumberMap;
    }
}
