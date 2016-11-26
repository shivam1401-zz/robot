package robot;

import java.util.Random;


/*
 * @author: Shivam Mishra
 * This class does all actual implementation. It is our target class. 
 * 
 */
public class PrototypeRobot implements RobotService {
	private Robot r;
	private RobotHealth rh;
	static int availbleCharging;
	
	public PrototypeRobot() {
		this.r = new Robot();
		this.rh = new RobotHealth();
	}
	
	
	@Override
	public void setCharging(int percentage){
		int currentCharging = r.getChargingStatus();
		if(currentCharging + percentage > 100)
			r.setChargingStatus(100);
		else{
			r.setChargingStatus(currentCharging+percentage);
		}
	}
	
	
	
	@Override
	public boolean walk(double km){
		   availbleCharging = r.getChargingStatus();
		   int requiredCharging = (int)(km*1000/50);
		   if(rh.powerCheck(r, requiredCharging)){
			   System.out.println("Walked "+km+"km | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
			   System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
			   System.out.println("************************************************");
			   return true;
		   }
		   return false;
	}

	@Override
	public boolean carry(int weight) {
			if(rh.canCarry(weight)){
				int requiredCharging = 2*weight;
				availbleCharging = r.getChargingStatus();
				if(rh.powerCheck(r, requiredCharging)){
					System.out.println("Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
					System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
					System.out.println("************************************************");
					return true;
				}
			}
			return false;
	}
	
	@Override
	public boolean walkAndCarry(double dist, int weight) {
		if(rh.canCarry(weight)){
			int requiredCharging = (int)(dist*1000/50) + 2*weight ;
			availbleCharging = r.getChargingStatus();
			if(rh.powerCheck(r, requiredCharging)){
				System.out.println("Walked "+ dist + "km and Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
				System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
				System.out.println("************************************************");
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void displayPrice(int barCode){
		if(barCode % 2 == 0){
			System.out.println("Price is "+ new Random().nextInt(100));
		}else{
			System.out.println("Scan Failure");
		}
	}
	

}
