package dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleWordsFromPhoneDigit {

    private static List<String> result = new ArrayList();

    public static void main(String[] args) {
        possibleWords(Arrays.asList(new String[]{"abc","def","ghi"}),3,0,"");
        System.out.println(result);
    }

    private static void possibleWords(List<String> data, int n, int i, String temp){
        if(i==n){
            result.add(temp);
            return;
        }
        for(int j=0;j<data.get(i).length();j++){
            possibleWords(data,n,i+1,temp+data.get(i).charAt(j));
        }
    }
}
