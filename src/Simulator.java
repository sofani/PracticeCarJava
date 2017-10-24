
public class Simulator {

	public static void main(String[] args) {
		CarPart engine = new Engine(2, 2, 2, 132, "start");
		CarPart wheel = new Wheels(2/32, 4, "17×7.5");
		CarPart tunk = new FuelTank(30, "tunk");
		
		Car c1 = new Car("Toyota Corolla");
		System.out.println(c1.getName());
        c1.addParts(engine);
        c1.addParts(wheel);
        c1.addParts(tunk);
        c1.run();
     
	}

}
