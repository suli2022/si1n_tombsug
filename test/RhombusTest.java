import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RhombusTest {
    Rhombus rhombus;
    @Before
    public void setUp() {
        rhombus = new Rhombus();
    }
    @Test
    public void testCalcRadius() {
        double radius = rhombus.calcRadius(30, 35);
        assertEquals(8.60364654526569, radius);
    }

    @Test
    public void testSecondCalcRadius() {
        double expectedRadius = 29.53918647207887;
        double actualRadius = rhombus.calcRadius(103, 35);
        assertEquals(expectedRadius, actualRadius);
    }

    @Test
    public void testEdgeMinCalcRadius() {
        double expectedRadius = 0.008726203218641756;
        double actualRadius = rhombus.calcRadius(1, 1);
        assertEquals(expectedRadius, actualRadius);
    }

    @Test
    public void testHaveCalcRadiusMethod() {
        ArrayList<String> methodNameList = new ArrayList<>();
        Method[] methods = Rhombus.class.getMethods();
        for(Method method : methods) {
            String name = method.getName();
            methodNameList.add(name);
        }
        boolean hasCalcRadius = methodNameList.contains("calcRadius");
        assertTrue(hasCalcRadius);
    }
    @Test
    public void testHaveFeladat0312Method() {
        ArrayList<String> methodNameList = new ArrayList<>();
        Method[] methods = Tombsug.class.getMethods();
        for(Method method : methods) {
            String name = method.getName();
            methodNameList.add(name);
        }
        boolean hasCalcRadius = methodNameList.contains("feladat0312");
        assertTrue(hasCalcRadius);
    }
}
