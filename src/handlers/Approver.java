package handlers;

import common.Type;

public abstract class Approver {

    protected Approver next;
    protected double consumablesLimit;
	protected double clericalLimit;
	protected double gadgetsLimit;
	protected double gamingLimit;
	protected double pcLimit;
    
    /**
     * If needed, be free to change signature of abstract methods.
     */
//    public abstract void approve(int id, double cost, Type type);
//    protected abstract boolean canApprove(double cost, Type type);
	
	
	public void approve(int id, double cost, Type type) {
		if (cost<0) {
			System.out.println("Purchase cost can not be negative.\n");
			return;
		}
		if (canApprove(cost, type)) {
			System.out.println(this + " approved purchase "+type+"  with id " + id + " that costs " + cost + "\n");
			return;
		}

		System.out.println("Purchase "+type+" with id " + id + " needs approval from higher position than " + this + ".");
		next.approve(id, cost, type);
	}


	protected boolean canApprove(double cost, Type type) {
		
		boolean result = false;

		switch (type) {
		case CONSUMABLES:
			if (cost <= consumablesLimit)
			{			
				result = true;
			}
			break;

		case CLERICAL:
			if (cost <= clericalLimit)
			{
				result = true;
			}			
			break;			

		case GADGETS:
			if (cost <= gadgetsLimit) 
			{
				result = true;
			}
			break;

		case GAMING:
			if (cost <= gamingLimit) 
			{
				result = true;
			}
			break;

		case PC:
			if (cost <= pcLimit) 
			{
				result = true;
			}
			break;
				
		default:
			System.out.println( "Incorrect purchase type.");
		}

		return result;
	}

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
