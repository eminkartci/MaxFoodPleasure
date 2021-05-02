
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

    public String toString() {
        return "\n--- Human ---\n" 
                + "Name         : " + this.name             + "\n"
                + "Money        : " + this.money            + "\n"
                + "Food Capacity: " + this.foodCapacity     + "\n"
                + "Pleasure     : " + this.pleasure;
    }   

}
