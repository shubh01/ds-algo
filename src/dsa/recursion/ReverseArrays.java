package dsa.recursion;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};

       int[] result = reverseRecursion(0,a.length-1,a);

        Arrays.stream(result).forEach(e-> System.out.println(e));

    }


    private static int[] reverseRecursion(int s, int e, int[] a){
        if(s>=e)
            return a;
        int temp = a[s];
        a[s]=a[e];
        a[e]=temp;
        return reverseRecursion(s+1,e-1,a);

    }

}
