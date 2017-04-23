package rmuti.car;

public class Car extends ArrayQueue implements Comparable {
	private String id;
	private String name;
	private int prices;

	public Car(String id, String name, int prices) {
		this.id = id;
		this.name = name;
		this.prices = prices;
	}


	@Override
	public boolean equals(Object obj) {
		Car otherCar = (Car) obj;
		if (otherCar.getId().equals(id)) {
			return true;

		} else {
			return false;
		}
	}

	public int compareTo(Object o) {
		Car otherCar = (Car) o;
		if (otherCar.getId().equals(id)) {
			return 0;

		} else {
			return -1;
		}
	}
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrices() {
		return prices;
	}


	public void setPrices(int prices) {
		this.prices = prices;
	}
	

}
