
public class Engine extends CarPart implements Functional  {
    private String running;
    private int horsePower;
    private int cylinderboreDiameter;
    private int crankshaftStrokeHeight;
    private int numberOfCylinders;
 
//	public Engine() {
//		running = "";
//		horsePower = 132;
//		cylinderboreDiameter = 2;
//		crankshaftStrokeHeight = 2;
//		numberOfCylinders = 2;
//	}
	public Engine(int diameter, int height, int cylinder, int horPower, String run) {
		cylinderboreDiameter = diameter;
		crankshaftStrokeHeight = height;
		numberOfCylinders = cylinder;
		horsePower = horPower;	
		running = run;
	}
	public int  cylinderCapacity() {
		return (int) (3.14 * (cylinderboreDiameter * cylinderboreDiameter) * 
				              crankshaftStrokeHeight * numberOfCylinders);
	
	}
	public int getHoursePower() {
		return this.horsePower;
	}
	public String start() {
		 if (running == "start")
	       return ("Engine is  starting ");
		 return "Enging is Stoping";
	}
	public String status() {
		if ( this.horsePower <= super.durability) {
			  return "The Engine is in Excellent condition";
		} else {
			return"Engin is in a " + super.status();
			
		}
	
	}
	  @Override
	public String function() {
		return "Engine has UNIQUE " + cylinderCapacity() + " CC CylinderCapacity";
	}
	
}
