package edu.exercise_1;

public class ModerateBrokerage implements KnownBrokerage {

	private Broker broker;
	
	@Override
	public void update() {
		
		switch (broker.getStockStatus()) {
		
		case GOING_DOWN_A_LOT:	
		case GOING_DOWN:
			System.out.println("Agència de borsa moderada comprant accions.");
			break;
			
		case RISING:	
		case RISING_A_LOT:
			System.out.println("Agència de borsa moderada venent accions.");
			break;
			
		default: 
			break;
		}
	}

	@Override
	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	@Override
	public String toString() {
		return "ModerateBrokerage";
	}
}
