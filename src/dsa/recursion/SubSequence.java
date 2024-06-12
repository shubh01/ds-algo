package dsa.recursion;

public class SubSequence {

    public static void main(String[] args) {
        subSequence("abc",0,"");
    }


    private static void subSequence(String s, int index, String tempStr){

        if(index == s.length()){
            System.out.println(tempStr);
            return;
        }

        subSequence(s,index+1,tempStr+s.charAt(index));
        subSequence(s,index+1,tempStr);
    }

}
