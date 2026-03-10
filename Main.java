public class OOPSBannerApp {

   
    static class CharacterPatternMap {
		
		Character character;
		String[] pattern;
  
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

      
        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

   
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        String[] O = {
           	"    *    ",
			" *     * ",
			"*       *",
			"*       *",
			"*       *",
			" *     * ",
			"    *    "
        };

        String[] P = {
			"**   ",
			"*   *  ",
			"*   *  ",
			"**   ",
			"**       ",
			"**       ",
			"**       "
        };

        String[] S = {
            "     ***   ",
			"   *    *  ",
			"   **       ",
			"      ***   ",
			"        **  ",
			"  *     *  ",
			"    ***    "
        };

        String[] SPACE = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        charMaps[3] = new CharacterPatternMap(' ', SPACE);

        return charMaps;
    }

   
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

 
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
