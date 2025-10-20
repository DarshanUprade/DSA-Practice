package WhyStaticAndDefaultIn_Interface;
   ////Why in java 8 introduce  static and default method in interface

  // Ans==> because if we implements interface from any class and if we want to add new method then we have to
   //              provide implementation to those classes also so thats why(without disturb implemented classes) .
         //  for example Collection Inteface extend from Set,List,Queue and classes implements ArrayList..... etc
//         Iterator interface we have  default ForEach( ) Method
interface Vehicle{
	public abstract void startVehicle();
	
	default int wheel() {
		return 4;
	}
	static String engine() {
		return null;
	}
}
class car implements Vehicle{
	@Override
	public void startVehicle() {
		System.out.println("car.startVehicle()");
	}
}
class Bus implements Vehicle{
	@Override
	public void startVehicle() {
		System.out.println("Bus.startVehicle()");
	}
	
	
}
public class MyClass  implements Vehicle{
	@Override
	public int wheel() {
		return 8;
	}
	@Override
	public void startVehicle() {
		System.out.println("MyClass.startVehicle()");
	}	
	public static void main(String[] args) {
		//Bus bus=new Bus();
		//bus.startVehicle();
		MyClass ob=new MyClass();
		ob.startVehicle();
		System.out.println("No. of Wheels:"+ob.wheel());

	}

}
