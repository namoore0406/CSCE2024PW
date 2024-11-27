
public class Ship {

	private String name;
	
	private String launchDate;
	
	//constructor
	
	public Ship(String name, String launchData) {
		this.name = name;
		
		setLaunchDate(launchDate);
	}
	
	//accessor and muatators
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	
	public void setLaunchDate(String launchDate) {
	    if (launchDate == null || !launchDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
	        System.out.println("Error: Invalid launch date format. Resetting launch date to default 01/01/1990.");
	        this.launchDate = "01/01/1990";
	        return;
	    }

	    int year = Integer.parseInt(launchDate.split("/")[2]);
	    if (year >= 1990 && year <= 2019) {
	        this.launchDate = launchDate;
	    } else {
	        System.out.println("Error: Launch date outside valid range. Resetting launch date to default 01/01/1990.");
	        this.launchDate = "01/01/1990";
	    }
	}	
	public String toString() {
		return "name: " + name + "\nLaunch Date: " + launchDate;
	}
	
}
