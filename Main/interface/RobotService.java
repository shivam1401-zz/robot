package robot;

/*
 * @author: Shivam Mishra
 * This interface defines general robot like features which will be exposed to public 
 */
public interface RobotService {

	boolean walk(double distance);
	boolean carry(int weight);
	boolean walkAndCarry(double distance, int weight);
	void setCharging(int percentage);
	void displayPrice(int barcode);
	
}
