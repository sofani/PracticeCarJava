import java.util.ArrayList;
import java.util.List;

public class Car {
	private String name;
	List<CarPart> listParts;
	public String getName() {
		return this.name;
	}
	public Car(String name) {
	    this.name = name;
	    listParts = new ArrayList<CarPart>();
	}
	public void addParts(CarPart cp) {
		  listParts.add(cp);
	}
    public void run() {
      for (CarPart cp1 :listParts ) {
    	  cp1.setDurability(20);
    	  System.out.println(cp1.status());
    	  System.out.println(cp1.function());
      }
	
   }
}
