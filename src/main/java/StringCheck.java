
public class StringCheck {
    /**
     *TBD:
     * - Check if the string is a palindrome (a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam).
     * - Please return True if the string is a palindrome, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isPalindrome (final String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();

        for (int i=0; i<length/2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    /**
     * TBD:
     * - Check if the string is empty
     * - Please return True if string is empty, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isEmpty(final String str) {
        if (str == null) {
            return false;
        }

        return str.equals("");
    }

    /**
     * TBD:
     * - Check if the string is null
     * - Please return True if string is null, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isNull(final String str) {
        return str == null;
    }

    /**
     * TBD:
     * - Check if the string contains only whitespace
     * - Please return True if string contains only whitespace, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isOnlyWhitespace(final String str) {
        if (str == null) {
            return true;
        }
        return str.trim().equals("");
    }
}
