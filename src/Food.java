

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
    
}
