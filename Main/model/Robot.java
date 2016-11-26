package robot;

/*
 * @author: Shivam Mishra
 * This is Robot Model Class.
 */
public class Robot {

	public enum Color{
		GREEN,RED
	}
	private int chargingStatus;
	private Color headLightColor;
	private int weightCapcity;
	private int walkCapcity;
	private static final int MAX_WEIGHT_CAPCITY = 10;
	
	public Robot(){
		this.chargingStatus = 100;
		this.walkCapcity = MAX_WEIGHT_CAPCITY;
		this.weightCapcity = 10;
		this.headLightColor = Color.GREEN;
	}

	public int getChargingStatus() {
		return chargingStatus;
	}

	public void setChargingStatus(int chargingStatus) {
		this.chargingStatus = chargingStatus;
	}

	public Color getHeadLightColor() {
		return headLightColor;
	}

	public void setHeadLightColor(Color headLightColor) {
		this.headLightColor = headLightColor;
	}

	public int getWeightCapicity() {
		return weightCapcity;
	}

	public void setWeightCapicity(int weightCapcity) {
		this.weightCapcity = weightCapcity;
	}

	public int getWalkCapcity() {
		return walkCapcity;
	}

	public void setWalkCapcity(int walkCapcity) {
		this.walkCapcity = walkCapcity;
	}

}
