import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    /**
     * TBD:
     * - Fix the initial test which is failing on purpose
     * - Add tests for null inputs
     * - Add tests for addition of two numbers
     * - Add tests for addition of multiple numbers
     *
     */
    @Test
    public void testSumAllNumbers() {
        assertEquals(null, calculator.sumAllNumbers());
        assertEquals(10, (Object) calculator.sumAllNumbers(1, 2, 3, 4));
        assertEquals(0, (Object) calculator.sumAllNumbers(0));
        assertEquals(4, (Object) calculator.sumAllNumbers(5));
        assertEquals(0, (Object) calculator.sumAllNumbers(-1,1,-2,2));
        assertEquals(5, (Object) calculator.sumAllNumbers(-5, 10));

    }

    /**
     * TBD:
     * - Add tests for null inputs
     * - Add tests for multiplication of two numbers
     * - Add tests for multiplication of multiple numbers
     *
     */
    @Test
    public void testMultiplyAllNumbers() {
        //write tests here
        assertEquals(null, calculator.multiplyAllNumbers());
        assertEquals(24, (Object) calculator.multiplyAllNumbers(1, 2, 3, 4));
        assertEquals(0, (Object) calculator.multiplyAllNumbers(0));
        assertEquals(5, (Object) calculator.multiplyAllNumbers(5));
        assertEquals(4, (Object) calculator.multiplyAllNumbers(-1,1,-2,2));
        assertEquals(-50, (Object) calculator.multiplyAllNumbers(-5, 10));
        assertEquals(12, (Object) calculator.multiplyAllNumbers(-3, -4));
    }
}
