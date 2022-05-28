import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void everyStatementTest(){
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("#", "2", "#", "#", "2", "#", "#", "2", "#"), SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "0", "#")));
    }

    @Test
    void everyBranchTest(){
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("#", "2", "#", "#", "2", "#", "#", "2", "#"), SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "0", "#")));
    }
}
