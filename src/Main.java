import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Constants
    private static String[] FOOD_NAMES  = {"Pizza","Mantı","Kebap","Pilav","Tatlı","Lahmacun","Künefe","Hambuger","Mercimek","Salata","Antrikot"};
    private static int FOOD_COUNT       = 20;
    private static int RANDOM_RANGE     = 10;
    private static int RANDOM_MIN       = 5;

    // Scanner
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanStr = new Scanner(System.in);
    private static Random  random    = new Random();

    // Call other classes
    private static Human human;
    private static ArrayList<Food> foods = new ArrayList<Food>();

    public static void main(String args[]){

        initialize();
        show(3);
    }

    public static void initialize(){
        // create human
        createHuman();

        // create random Foods
        createFoods(FOOD_COUNT);

    }

    public static void show(int mode){

        if (mode == 1){
            System.out.println(human);
        }else if (mode == 2){
            System.out.println(foods);
        }else if (mode == 3){
            System.out.println(human);
            System.out.println(foods);
        }else{
            System.out.println("Please give avalid mode !");
        }


    }

    public static void createFoods(int foodCount){

        for(int i = 0 ; i < foodCount; i++){
            
            Food tempFood = new Food(FOOD_NAMES[random.nextInt(FOOD_NAMES.length)] + "_E"+ random.nextInt(RANDOM_RANGE) ,random.nextInt(RANDOM_RANGE)+RANDOM_MIN,random.nextInt(RANDOM_RANGE)+RANDOM_MIN,random.nextInt(RANDOM_RANGE)+RANDOM_MIN);
            foods.add(tempFood);
        }

    }

    public static void createHuman(){

        // get inputs from user
        System.out.println("Name            : "); String name = scanStr.nextLine();
        System.out.println("Money           : "); int money = scanInt.nextInt();
        System.out.println("Food Capacity   : "); int capacity = scanInt.nextInt();
        // return it
        human = new Human(name,money,capacity);
    }


    
}
