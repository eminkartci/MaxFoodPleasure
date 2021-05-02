import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Scanner
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanStr = new Scanner(System.in);

    // Call other classes
    private static Human human;
    private static ArrayList<Food> foods = new ArrayList<Food>();

    public static void main(String args[]){

        initialize();

    }

    public static void initialize(){
        // create human
        human = createHuman();

        // create random Foods
        foods = createFoods();

    }

    public static ArrayList<Food> createFoods(int foodCount){

        for(int i = 0 ; i < foodCount; i++){
            
        }

    }

    public static Human createHuman(){

        // get inputs from user
        System.out.println("Name            : "); String name = scanStr.nextLine();
        System.out.println("Money           : "); int money = scanInt.nextInt();
        System.out.println("Food Capacity   : "); int capacity = scanInt.nextInt();
        // return it
        return new Human(name,money,capacity);
    }


    
}
