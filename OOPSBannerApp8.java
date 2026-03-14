import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    public static void main(String[] args) {

        String word = "OOPS";
        String gap = "   ";

        Map<Character, String[]> patternMap = buildPatterns();

        renderBanner(word, patternMap, gap);
    }

    // Method to build character patterns
    public static Map<Character, String[]> buildPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map, String gap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(gap);
                }
            }

            System.out.println(line);
        }
    }
}