package edu.exercise_1;

public class RiskBrokerage implements KnownBrokerage {

	private Broker broker;

	@Override
	public void update() {

		switch (broker.getStockStatus()) {

		case GOING_DOWN_A_LOT:
		case GOING_DOWN:
		case GOING_DOWN_SLIGHTLY:
			System.out.println("Agència de borsa d'alt risc comprant accions.");
			break;

		case RISING_A_LOT:
			System.out.println("Agència de borsa d'alt risc venent accions");
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
		return "RiskBrokerage";
	}
}
