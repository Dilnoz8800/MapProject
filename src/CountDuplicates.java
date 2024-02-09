import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

    public static void main(String[] args) {

        System.out.println(countDuplicates("aabBcde"));
        System.out.println(countDuplicates("Indivisibilities"));
        System.out.println(countDuplicates("aA11"));

    }

    public static int countDuplicates(String input){
        //create a map to store character frequency
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c,0) +1 );
            }
        }

        int count = 0;
        //count characters that occurs more than one time

        for(int frequency : charFrequency.values()) // get the values of frequency map
        {
            if(frequency>1) count++;
        }

        return count;
    }

}


/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

 */
