import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int VehicleId;

	public Vehicle(int vehicleId) {
		
		VehicleId = vehicleId;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}
	
	
}

class Car extends Vehicle {
	 private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	 
	 
}

public class App {
    public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(33,"honda"));
		display(list);
		
		List<Integer> ints = new ArrayList<>();
		ints.add(55);
		ints.add(66);
		
		display(ints);
		
		displayInfo(list);
		
		//displayInfo(ints);
	}
    
    public static void display(List<?> list) {
    	for (Object elem:list)
    	{
    		System.out.println(elem);
    	}
    }
    
    public static void displayInfo(List<? extends Vehicle> list)
    {
    	for (Object elem:list)
    	{
    		System.out.println(elem);
    	}
    }
}
