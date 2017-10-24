
public class CarPart implements Functional {
	 protected int durability = 100;
	 public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability -= durability;
	}
	public String status() {
		if (durability > 50 ) {
			return "Good Condition";
		} 
			return "Bad Condition";
		
	 }
	@Override
	public String function() {
		if (durability == 100) 
			return "functioning well";
		return "something is wrong";
	}
}


