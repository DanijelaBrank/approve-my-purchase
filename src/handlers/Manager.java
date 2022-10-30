package handlers;

//import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {


	public Manager() {
		this.consumablesLimit = 300;
		this.clericalLimit = 500;
		this.gadgetsLimit = 1000;
		this.gamingLimit = 3000;
		this.pcLimit = 5000;
	}


	@Override
	public String toString() {
		return "Manager";
	}
}
