

public class Food {

    // Attributes
    private String name;
    private int cost;
    private int satiety;    // Doyuruculuk
    private int pleasure;

	// Constructor
    public Food(String name,int cost,int satiety,int pleasure){
        this.name = name;
        this.cost = cost;
        this.satiety = satiety;
        this.pleasure = pleasure;
    }

    public String toString() {
        return "\n--- Food ---\n" 
                + "Name         : " + this.name        + "\n"
                + "Cost         : " + this.cost        + "\n"
                + "Satiety      : " + this.satiety     + "\n"
                + "Pleasure     : " + this.pleasure;
    }  

    // GETTER SETTER
    
    public String getName(){
        return this.name;
    }
    
    public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getSatiety() {
		return satiety;
	}

	public void setSatiety(int satiety) {
		this.satiety = satiety;
	}

	public int getPleasure() {
		return pleasure;
	}

	public void setPleasure(int pleasure) {
		this.pleasure = pleasure;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}
