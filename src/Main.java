//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        String word = "always";
        boolean result = isUnique(word);
        System.out.println("Is " + word + " unique?: " + result);
        word = "another";
        result = isUnique(word);
        System.out.println("Is " + word + " unique?: " + result);
    }

    /**
     * isUnique checks if all of the characters in the string
     * are unique
     * @return boolean
     */
    public static boolean isUnique (String word) {
        if (word == null) {
            return true;
        }
        int length = word.length();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < length; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}