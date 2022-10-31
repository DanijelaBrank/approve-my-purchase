package handlers;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
	
	public President() {
		this.consumablesLimit = 700;
		this.clericalLimit = 1500;
		this.gadgetsLimit = 2000;
		this.gamingLimit = 4500;
		this.pcLimit = 6500;
	}
	
	@Override
	public String toString() {
		return "President";
	}
    
}
