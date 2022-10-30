package handlers;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Manager {

    public Director() {
    	this.consumablesLimit = 500;
		this.clericalLimit = 1000;
		this.gadgetsLimit = 1500;
		this.gamingLimit = 3500;
		this.pcLimit = 6000;
	}

	@Override
    	public String toString() {
    		return "Director";
    	}
	
}
