import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;


public class RobotTest {

    @Rule
    public Timeout globalTimeout = Timeout.millis(100);

    Robot buddy = new Robot("Buddy", 4);

    @Test
    public void testGetName()
    {
        assertEquals("Buddy", buddy.getName());
    }

    @Test
    public void testGetAge()
    {
        assertEquals(4,buddy.getAge());
    }


    @Test
    public void testIsNotWorking()
    {
        assertFalse(buddy.isWorking());
    }

    @Test
    public void testIsWorking()
    {
        buddy.talkToRobot();
        assertTrue(buddy.isWorking());
    }

    @Test
    public void testGetWorkingMessage()
    {
        buddy.talkToRobot();
        assertEquals("I am in working mode", buddy.getWorkingMessage());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetWorkingMessageFail()
    {
        assertEquals("I am in working mode", buddy.getWorkingMessage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNameFail()
    {
        Robot chuck = new Robot("",5);
        assertEquals("chuck", chuck.getName());
    }

    @Test//(timeout = 10)
    public void testWaitTillWorking()
    {
        buddy.waitTillWorking();
    }
}