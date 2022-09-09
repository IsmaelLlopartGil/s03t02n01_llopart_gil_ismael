package edu.exercise_1;

public class StockMarketSession {

	private Broker broker;

	public StockMarketSession(Broker broker) {
		this.broker = broker;
	}

	public void createEvent() {
		StockStatus stockStatus = StockStatus.getRandomStatus();

		System.out.println(stockStatus.getString());
		broker.setStockStatus(stockStatus);
	}
}
