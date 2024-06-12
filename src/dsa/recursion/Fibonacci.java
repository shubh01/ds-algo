package dsa.recursion;

public class Fibonacci {

    public static void main(String[] args) {
 //       printLoop(5);
        System.out.println(printRecursion(5));
    }


    private static int printRecursion(int n){

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        return printRecursion(n-1)+printRecursion(n-2);


    }

    private static void printLoop(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int sum = a+b;
            a=b;
            b=sum;
        }
    }

}
