package bussines_layer;

public class Report {
	
	private static Report report;
	
	private Report() {
		
	}
	
	public static Report getInstance() {
		
		if(report==null) {
			report = new Report();
		}
		
		return report;
	}
	
	//public
	
	

}
