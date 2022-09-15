
public class Bricklayer extends Builder{
	private int noOfDays;
	private double rate;
	
	public Bricklayer(String name,int noOfDays,double rate) {
		super(name);
		this.noOfDays = noOfDays;
		this.rate = rate;
	}
	
	public int getNoOfDays() {
		return this.noOfDays;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double calculateCost() {
		return getNoOfDays()*getRate();
	}
	
	public void display() {
		super.display();
		System.out.println("Number of days to complete house: "+getNoOfDays());
		System.out.println("Rate: "+getRate()+" per day");
		System.out.println("Total cost of construction: "+calculateCost());
	}
	
	
	

}
