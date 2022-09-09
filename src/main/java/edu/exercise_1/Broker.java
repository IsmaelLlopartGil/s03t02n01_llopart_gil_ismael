package edu.exercise_1;

import java.util.ArrayList;

public class Broker {

	private ArrayList<KnownBrokerage> knownBrokerageList;
	private StockStatus stockStatus;

	public Broker() {
		knownBrokerageList = new ArrayList<>();
		setStockStatus(StockStatus.KEEPING);
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;

		if (stockStatus != StockStatus.KEEPING) {
			notifyKnownBrokerage();
		}
	}

	private void notifyKnownBrokerage() {
		if (!knownBrokerageList.isEmpty()) {
			for (KnownBrokerage knownBrokerage : knownBrokerageList)
				knownBrokerage.update();
		}
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void attachKnownBrokerage(KnownBrokerage knownBrokerage) {

		if (!this.knownBrokerageList.contains(knownBrokerage)) {
			this.knownBrokerageList.add(knownBrokerage);
			knownBrokerage.setBroker(this);
		}
	}

	public void detachKnownBrokerage(KnownBrokerage knownBrokerage) {
		this.knownBrokerageList.remove(knownBrokerage);
		knownBrokerage.setBroker(null);
	}
}
