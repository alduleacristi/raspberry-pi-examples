package ro.home.raspeberry.model;

import java.time.LocalDateTime;

public class Temperature {
	private final double value;
	private LocalDateTime date;

	public Temperature(double value) {
		this.value = value;
		this.date = LocalDateTime.now();
	}

	public double getValue() {
		return value;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
