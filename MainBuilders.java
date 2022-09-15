
public class MainBuilders {

	public static void main(String[] args) {
		Builder[] builders = {
				new
	Bricklayer("Roland",270,1600.0),
				new
	Bricklayer("Maya",180,2600.0),
	            new
	Contractor("Borderlands Inc",185,278.7),
	            new
	Contractor("Vault Tec Construction",175,278.7)};
	
		for(int i = 0;i < builders.length;i++) {
			builders[i].display();
			System.out.println();
			
		}
		

	}

}
