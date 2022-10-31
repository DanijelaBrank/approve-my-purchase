package handlers;

/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {

	public VicePresident() {
		this.consumablesLimit = 1000;
		this.clericalLimit = 2000;
		this.gadgetsLimit = 3000;
		this.gamingLimit = 5000;
		this.pcLimit = 8000;
	}
	
	@Override
	public String toString() {
		return "Vice President";
	}

}