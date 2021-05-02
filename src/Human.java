
public class Human {

	// Attributes
	private String 	name;
    private int 	money;
    private int 	foodCapacity;
    private int 	pleasure;

    public Human(String name,int money, int foodCapacity) {
    	
        this.name           = name;
        this.money          = money;
        this.foodCapacity   = foodCapacity;
        this.pleasure       = 0;
    }

    // GETTER SETTER 
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getFoodCapacity() {
		return foodCapacity;
	}

	public void setFoodCapacity(int foodCapacity) {
		this.foodCapacity = foodCapacity;
	}

	public int getPleasure() {
		return pleasure;
	}

	public void setPleasure(int pleasure) {
		this.pleasure = pleasure;
	}

	public String toString() {
        return "\n--- Human ---\n" 
                + "Name         : " + this.name             + "\n"
                + "Money        : " + this.money            + "\n"
                + "Food Capacity: " + this.foodCapacity     + "\n"
                + "Pleasure     : " + this.pleasure;
    }   

}
