package dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        permutation(new Integer[]{1,2,3},0);
        System.out.println(result);
    }


    private static void permutation(Integer[] a, int i){

        if(i >= a.length){

            result.add(new ArrayList(Arrays.asList(a)));
        }

        for(int j=i;j<a.length;j++){
            swap(a,i,j);
            permutation(a,i+1);
            swap(a,j,i);
        }

    }

    private static void swap(Integer[] a, int i, int j){

        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;

    }

}
