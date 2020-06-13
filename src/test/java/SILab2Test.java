import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 lab = new SILab2();

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void function() {

    }

    @Test
    void everystatementTest(){
       RuntimeException ex;
       ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
       assertTrue(ex.getMessage().contains("List length should be greater than 0"));

       assertEquals(2d, SILab2.function(createList("0d, #")));
       assertEquals(2d, SILab2.function(createList("#, 0d")));
    }

    @Test
    void everyPathTest(){
        //ABN
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        //ACD1D2ELD3D2M
        //ACD1D2EFIJKD3D2MN
        //ACD1D2EFGIJKD3D2MN
        assertEquals(2d, SILab2.function(createList("0d, #")));

        //ACD1D2ELD3D2EFGHIJKD3D2MN
        assertEquals(2d, SILab2.function(createList("#, 0d, #")));

        //ACD1D2EFGIKD3D2MN
        assertEquals(0d, SILab2.function(createList("0")));
    }

}