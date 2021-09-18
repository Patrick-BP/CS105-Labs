package ClassPractice;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize  = ramSize;
		this.processorSpeed = processorSpeed;
		
	}
	public Computer() {
		manufacturer = "HP";
		processor = "Intel";
		ramSize  = 0;
		processorSpeed = 3.5; 
		
	}
	
public double computerPower() {
	return  ramSize * processorSpeed;
 
}	
public int getRamSize() {
	return ramSize;
}
public void setRamSize(int ramSize) {
	this.ramSize = ramSize;
}

@Override
public String toString() {
	return "The computer power of a computer with a Ram of " + ramSize + " and prcessor speed of " + processorSpeed + " is: " + computerPower();
 }

public boolean equal(Computer ob) {
	
	boolean res = manufacturer.equals(ob.manufacturer) && processor.equals(ob.processor) && ramSize == ob.ramSize && processorSpeed == ob.processorSpeed;
	return res;
	
}
}
