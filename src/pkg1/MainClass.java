package pkg1;
abstract class Vehicle{
	public Vehicle() {
		System.out.println("Abstarct Class Vehicle()....");
	}
	public static String ModelName;
	abstract void engine();
	public abstract int wheels(int tier);
	static void door() {
		System.out.println("Vehicle.door() Static method executed");
	}
	public static void main(String[] args) {
		System.out.println("Vehicle.main()");
	}
}
class Car extends  Vehicle {
	public Car() {
		super();
		System.out.println("Car class Constructor Call......");
	}

	@Override
	public void engine() {
		System.out.println("ModelName"+ModelName);
		System.out.println("4 Trock Engine.......");
		door();
	}
	@Override
	public int wheels(int tier) {
		ModelName="C4AlN";
		System.out.println("Car.wheels()");
		this.engine();
		return tier;
	}
}
class Truck extends Vehicle{
	public Truck() {
		System.out.println("Truct Class Constructor Excecuted");
	}
	@Override
	void engine() {
		System.out.println("truck.engine()");
	}
	@Override
	public int wheels(int tier) {
		System.out.println("truck.wheels()");	
		this.engine();
		return tier;
	}

}

public class MainClass{
	public static void main(String[] args) {
		System.out.println("Welcome to Coding Area");
		Vehicle car=new Car();
		int chaka=car.wheels(4);
		System.out.println("No of tiers in Car is::"+chaka);
		Vehicle t=new Truck();
		t.wheels(chaka);


	}

}
