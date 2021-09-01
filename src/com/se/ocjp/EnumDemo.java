package com.se.ocjp;

public class EnumDemo {

	public static void main(String[] args) {
		
		Vehicle.TWOWHEELER.setType("bicycle");

        for (Vehicle p : Vehicle.values()) {

              System.out.println(p + ": " + p.getType());

        }

	}

	enum Vehicle {

		TWOWHEELER("bike"), FOURWHEELER("car");

		private String type;

		private Vehicle(String type) {

			this.type = type;

		}

		private void setType(String type) {

			this.type = type;

		}

		private String getType() {

			return type;

		}

	}

}
