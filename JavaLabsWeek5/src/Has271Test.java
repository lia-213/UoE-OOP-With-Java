import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Has271Test {

	@Test
	public void testHas271(){
        assertTrue(Has271Perfect.has271(new int[] {1, 3, 8, 2}));
        assertTrue(Has271Perfect.has271(new int[] {2, 7, 1}));
        assertTrue(Has271Perfect.has271(new int[] {4, 9, 3}));
        assertTrue(Has271Perfect.has271(new int[] {1, 3, 8, 2, 5}));
        
        assertFalse(Has271Perfect.has271(new int[] {1, 2, 8, 1}));
	}
}
