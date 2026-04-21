import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest 
{

    NumberUtils utils = new NumberUtils();

    @Test
    void testFactorial() 
    {
        assertEquals(120, utils.factorial(5));
    }

    @Test
    void testIsPrime() 
    {
        assertTrue(utils.isPrime(5));
    }

    @Test
    void testNotPrime() 
    {
        assertFalse(utils.isPrime(8));
    }
}
