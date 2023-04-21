import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(List.of("abc", "efabcd", "abcde", "aab"));
        String pattern = "ab";
        ArrayList<String> result = findStrArr(list, pattern);
        ArrayList<String> result2 = checkStringContainPattern(list, pattern);
    }

    public static ArrayList<String> findStrArr(ArrayList<String> strArr, String pattern) {
        ArrayList<String> result = new ArrayList<String>();
        for(String s: strArr) {
            if(s.startsWith(pattern)) {
                result.add(s);
            }
        }

        return result;
    }

    public static ArrayList<String> checkStringContainPattern(ArrayList<String> strArr, String pattern) {
        ArrayList<String> result = new ArrayList<String>();
        for(String s: strArr) {
            if(s.contains(pattern)) {
                System.out.println(s);
                result.add(s);
            }
        }

        return result;
    }
}
