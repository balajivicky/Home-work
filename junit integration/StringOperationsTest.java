import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

class StringOperationsTest 
{

    @Test
    void testFindDuplicates() 
	{
        Set<Character> result = StringOperations.findDuplicates("programming");
        assertTrue(result.contains('r'));
        assertTrue(result.contains('g'));
        assertTrue(result.contains('m'));
    }

    @Test
    void testRemoveSpaces() 
	{
        String result = StringOperations.removeSpaces("Hello World");
        assertEquals("HelloWorld", result);
    }

    @Test
    void testReverseString() 
	{
        String result = StringOperations.reverseString("Balaji");
        assertEquals("ijalaB", result);
    }

    @Test
    void testReverseEmptyString() 
	{
        String result = StringOperations.reverseString("");
        assertEquals("", result);
    }
}