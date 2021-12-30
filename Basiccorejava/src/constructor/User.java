package constructor;

public class User {

	public static void main(String[] args) {
		// Car.wheels=40;
		Car Kia = new Car();
		Kia.colour = "orange";
		Kia.engine = 1200;
		Kia.model = "Seltos";
		// Kia.wheels=4;
		Kia.feature();

		// Kia.feature();

		Car vw = new Car();
		vw.colour = "white";
		vw.model = "Polo";
		vw.engine = 1600;
		Kia.wheels = 4;

		vw.feature();

		Car honda = new Car();
		honda.colour = "RED";
		honda.model = "City";
		honda.engine = 1400;
		honda.feature();

	}

}
