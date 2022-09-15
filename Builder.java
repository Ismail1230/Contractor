
public abstract class Builder {
	private String name;
	public static final double  METER2_TO_FEET2 = 10.764;
	
	public Builder(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract double calculateCost();
	
	public void display() {
		System.out.println("***Bidding details for "+ getClass().getSimpleName()+":"+getName()+"***");
	}

}
