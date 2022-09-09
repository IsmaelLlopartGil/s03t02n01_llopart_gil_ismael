package edu.exercise_1;

import java.security.SecureRandom;

public enum StockStatus {
	KEEPING("Mantenint-se"),
	RISING_SLIGHTLY("Pujant lleugerament"), RISING("Pujant"), RISING_A_LOT("Pujant molt"),
	GOING_DOWN_SLIGHTLY("Baixant lleugerament"), GOING_DOWN("Baixant"), GOING_DOWN_A_LOT("Baixant molt");

	private String string;

	private StockStatus(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public static StockStatus getRandomStatus() {
		return StockStatus.values()[new SecureRandom().nextInt(StockStatus.values().length)];
	}
}
