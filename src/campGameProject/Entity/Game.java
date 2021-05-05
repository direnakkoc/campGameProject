package campGameProject.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	private double rank;

	public Game() {

	}

	public Game(int id,String name, double price, double rank) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.rank = rank;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

}
