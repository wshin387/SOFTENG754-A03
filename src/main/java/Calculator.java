import java.util.Arrays;

public class Calculator {

	/**
     * TBD:
     * - Add all Integers together
     * - Note: do not change method signature
     */
    public Integer sumAllNumbers(final Integer... valuesParam) {
        if (valuesParam == null || valuesParam.length == 0) {
            return null;
        }

        return Arrays.stream(valuesParam).reduce(0,(a,b) -> a + b);
    }

    /**
     * TBD:
     * - Multiply all Integers together
     * - Note: do not change method signature
     */
    public Integer multiplyAllNumbers(final Integer... valuesParam){
        if (valuesParam == null || valuesParam.length == 0) {
            return null;
        }

        return Arrays.stream(valuesParam).reduce(1, (a,b) -> a * b);
    }
}
