import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)

public class RobotParamTestCheckCost {
    private double expected;
    private int age;

    public RobotParamTestCheckCost(double expected, int age)
    {
        this.expected = expected;
        this.age = age;
    }

    @Parameterized.Parameters (name= "{index}: checkCost({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {//list in same order as constructor
                {10000, 1},
                {10000, 5},
                {7500, 7},
                {7500, 10},
                {5000, 12},
        });
    }

    @Test
    public void testCheckCostAll() {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkCost(), .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001);

    }
}