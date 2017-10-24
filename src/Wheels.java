
public class Wheels extends CarPart implements Functional {
   private double treaddepth;
   private int numberOfWheels;
   private String sizeWheels;
   
	@Override
	public String  function() {
		return "Wheels has UNIQUE " + getSizeWheels()  + " Size";
		
	}
	
	public double getTreaddepth() {
		return treaddepth;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public String getSizeWheels() {
		return sizeWheels;
	}

//	public Wheels() {
//		treaddepth = 2/32;
//		numberOfWheels = 4;
//		sizeWheels = "17×7.5";
//	}
	public Wheels(double treaddepth, int numberOfWheels, String sizeWheels) {
		this.treaddepth = treaddepth;
		this.numberOfWheels = numberOfWheels;
		this.sizeWheels = sizeWheels;
	}
	public String status() {
		if (super.durability >= this.treaddepth) {
		  return "The wheel is in Excellent condition";
		} else {
			return "The Wheel is in " + super.status();
		}	
	}
}
