package edu.exercise_1;

public class App {

	private void runScenario() {

		Broker broker = new Broker();
		broker.attachKnownBrokerage(new ConservativeBrokerage());
		broker.attachKnownBrokerage(new RiskBrokerage());
		broker.attachKnownBrokerage(new ModerateBrokerage());

		StockMarketSession stockMarketSession = new StockMarketSession(broker);

		for (int i = 0; i < 5; i++) {
			System.out.print("Nou esdeveniment a la sessió: ");
			stockMarketSession.createEvent();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new App().runScenario();
	}
}
