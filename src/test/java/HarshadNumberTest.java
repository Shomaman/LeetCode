import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumberTest {
        private final HarshadNumber harshadNumber = new HarshadNumber();
    @Test
    void sumOfTheDigitsOfHarshadNumber() {
        assertEquals(3, harshadNumber.sumOfTheDigitsOfHarshadNumber(12));
        assertEquals(-1, harshadNumber.sumOfTheDigitsOfHarshadNumber(23));

    }
}