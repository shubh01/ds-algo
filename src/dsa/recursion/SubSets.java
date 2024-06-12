package dsa.recursion;

import java.util.ArrayList;

public class SubSets {

    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1,2,3};
        generateSubSets(0,data, new ArrayList<>());
        System.out.println(result);
    }

    private static void generateSubSets(int i, Integer[] a, ArrayList<Integer> tmp){
        if(i==a.length){
            result.add(new ArrayList<>(tmp));
            return;
        }

        tmp.add(a[i]);
        generateSubSets(i+1,a,tmp);
        tmp.removeLast();
        generateSubSets(i+1,a,tmp);
        return;
    }

}
