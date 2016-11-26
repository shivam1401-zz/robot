package robot;

/*
 * @author: Shivam Mishra
 */
public class RobotMain {
	public static void main(String[] args){
		RobotService obj = new PrototypeRobot();
		obj.walk(3.5);
		obj.carry(5);
		obj.walkAndCarry(1,13);
		obj.setCharging(70);
		obj.walkAndCarry(3,2);
		obj.displayPrice(18);
	}
}
