import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int romanToInt(String s) {
        final List<Integer> number = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            number.add(charToInt(s.charAt(i)));
        }

        Integer ans = 0;
        for (int i = 0; i < number.size(); i++) {
            if (i == number.size() - 1) {
                ans += number.get(i);
                break;
            }

            if (number.get(i) < number.get(i + 1)) {
                ans -= number.get(i);
            } else {
                ans += number.get(i);
            }
        }
        return ans;
    }

    private int charToInt(char s) {
        int i = 0;

        switch (s) {
            case 'M':
                i = 1000;
                break;
            case 'D':
                i = 500;
                break;
            case 'C':
                i = 100;
                break;
            case 'L':
                i = 50;
                break;
            case 'X':
                i = 10;
                break;
            case 'V':
                i = 5;
                break;
            case 'I':
                i = 1;
                break;
            default:
                i = 0;
        }

        return i;
    }
}