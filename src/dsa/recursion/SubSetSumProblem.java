package dsa.recursion;

public class SubSetSumProblem {

    public static void main(String[] args) {

        System.out.println(subSetSum(new int[]{3,34,4,12,5,2},0,9,0));
    }

    private static Boolean subSetSum(int[] a, int temp, int sum, int i){

        if(i>=a.length){
            return false;
        }

        if(temp == sum)
            return true;

        Boolean first = subSetSum(a,temp+a[i],sum,i+1);
        Boolean second = subSetSum(a,temp,sum,i+1);

        return first || second;
    }

}
