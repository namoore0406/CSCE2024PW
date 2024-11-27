
public class CargoShip extends Ship{

	private int tonnage;
	
	private double maxSpeed;
	
	
	//constructor
	
	public CargoShip(String name, String launchDate, int tonnage, double maxSpeed) {
		super(name, launchDate);
		
		this.tonnage = tonnage;
		
		this.maxSpeed = maxSpeed;
	}
	
	
	public int getTonnage() {
		return tonnage;
	}
	
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
		
		
	}
}
