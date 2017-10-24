
public class FuelTank extends CarPart implements Functional{
	private double tank = 0.0;
    private String name;
    FuelTank(double tank, String name) {
    	this.tank =  tank;
    	this.name = name;
    }
    public boolean emptyTank() { 
      return (tank == 0);
    }
  
	public double getTank() {
		return tank;
	}

	public void setTank(double tank) {
		this.tank += tank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String  status() {
		if ( this.tank <= super.durability) {
			  return "The tank is in Excellent condition";
		} else {
			return "The tank is in a " + super.status();
		}
	
	}
	  @Override
	public String function() {
		  if (emptyTank()) {
		    return "UNIQUE  Zero fuel Tank";
		  }
		  return "UNIQUE glad I have Fuel";
	}
}