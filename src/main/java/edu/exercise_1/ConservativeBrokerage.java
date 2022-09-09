package edu.exercise_1;

public class ConservativeBrokerage implements KnownBrokerage {

	private Broker broker;

	@Override
	public void update() {

		switch (broker.getStockStatus()) {

		case GOING_DOWN_A_LOT:
			System.out.println("Agència de borsa conservadora comprant accions.");
			break;

		case RISING_SLIGHTLY:
		case RISING:
		case RISING_A_LOT:
			System.out.println("Agència de borsa conservadora venent accions.");
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
		return "ConservativeBrokerage";
	}
}
