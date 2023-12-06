import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (Integer integer : L) {
            sum += integer;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : L) {
            if (integer % 2 == 0) {
                newList.add(integer);
            }
        }
        return newList;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> newList = new ArrayList<>();
        for (Integer item1 : L1) {
            for (Integer item2 : L2) {
                if (Objects.equals(item1, item2)) {
                    newList.add(item1);
                }
            }
        }
        return newList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int times = 0;
        for (String s : words) {
            if (s.indexOf(c) > 0) {
                times += 1;
            }
        }
        return times;
    }
}
