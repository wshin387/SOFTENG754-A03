import org.junit.Test;
import static org.junit.Assert.*;

public class StringCheckTest {
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void testIsPalindrome() {
        assertFalse(stringCheck.isPalindrome("aabb"));
        assertFalse(stringCheck.isPalindrome(null));
        assertFalse(stringCheck.isPalindrome("NotEvenClose"));
        assertTrue(stringCheck.isPalindrome(""));
        assertTrue(stringCheck.isPalindrome("abba"));
        assertTrue(stringCheck.isPalindrome("tattarrattat"));
    }

    /**
     * TBD:
     * - Create tests for the other methods you create in the main.java.StringCheck Class
     */
    @Test
    public void testIsEmpty() {
        assertTrue(stringCheck.isEmpty(""));
        assertFalse(stringCheck.isEmpty("a"));
        assertFalse(stringCheck.isEmpty(null));
        assertFalse(stringCheck.isEmpty("abc"));
    }

    @Test
    public void testIsNull() {
        assertTrue(stringCheck.isNull(null));
        assertFalse(stringCheck.isNull(""));
        assertFalse(stringCheck.isNull("abc"));
    }

    @Test
    public void testIsOnlyWhiteSpace() {
        assertTrue(stringCheck.isOnlyWhitespace(null));
        assertTrue(stringCheck.isOnlyWhitespace(""));
        assertTrue(stringCheck.isOnlyWhitespace(" "));
        assertFalse(stringCheck.isOnlyWhitespace("   "));
        assertFalse(stringCheck.isOnlyWhitespace(" a"));
        assertFalse(stringCheck.isOnlyWhitespace("a "));
        assertFalse(stringCheck.isOnlyWhitespace(" ab "));
        assertFalse(stringCheck.isOnlyWhitespace(" a b"));
    }
}
