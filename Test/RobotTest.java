package robot;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/*
 * @author: Shivam Mishra
 * Test Class
 */
@SuppressWarnings("deprecation")
public class RobotTest {
	private RobotService robo;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void roboTest() {
		robo = new PrototypeRobot();
		robo.walk(3.5);
		robo.walkAndCarry(1,13);
		//Assert.assertTrue("Failed", robo.walk(4));
		robo.setCharging(60);
		Assert.assertTrue("Failed", robo.walk(4));
	
	}
}

