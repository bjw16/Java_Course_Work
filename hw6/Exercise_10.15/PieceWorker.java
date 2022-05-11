public class PieceWorker extends Employee{
	private double wage;
	private int pieces;
	
	public PieceWorker(String fname, String lname, String ssn, double wage, int pieces){
		super(fname,lname,ssn);
		
      if (wage < 0.0) { // validate wage
         throw new IllegalArgumentException("Wage must be >= 0.0");
      }
	   if (pieces < 0.0) { // validate wage
         throw new IllegalArgumentException("Pieces must be >= 0.0");
      }
		this.wage = wage;
		this.pieces = pieces;
	}
	
	@Override
	public double earnings(){
		return wage * pieces;
	}
	
	@Override
	public String toString() {                                            
      return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", 
         super.toString(), "wage per pieces", wage,                     
         "amount of pieces", pieces);     
	}

}
