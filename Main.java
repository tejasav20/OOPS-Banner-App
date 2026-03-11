import java.util.Map;
import java.util.HashMap;
public class OOPSBannerApp {

    private static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{		
	    	"    *    ",
			" *     * ",
			"*       *",
			"*       *",
			"*       *",
			" *     * ",
			"    *    "
        });

        patterns.put('P', new String[]{
            "  **  ",
            " *    * ",
            " *    * ",
            " **  ",
            " **       ",
            " **       ",
            " **       "
        });

        patterns.put('S', new String[]{
           "  ** ",
            " **      ",
            " **      ",
            "  *  ",
            "       **",
            "       **",
            " **  "
        });

        return patterns;
    }

    private static void displayBanner(String word, Map<Character, String[]> patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patterns.getOrDefault(c, new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "});
                line.append(pattern[i]).append("  ");
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> characterPatterns = createPatternMap();
        displayBanner("OOPS", characterPatterns);
    }
}
