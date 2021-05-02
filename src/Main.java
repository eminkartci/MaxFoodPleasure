
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import gurobi.*;

public class Main {

    // Constants
    private static String[] FOOD_NAMES  = {"Pizza","Mantı","Kebap","Pilav","Tatlı","Lahmacun","Künefe","Hambuger","Mercimek","Salata","Antrikot"};
    private static int FOOD_COUNT       = 20;
    private static int RANDOM_RANGE     = 10;
    private static int RANDOM_MIN       = 5;
    private static String GUROBI_NAME   = "Emin.log";
    private static String GUROBI_LOG_NAME= "Cansu.lp";

    // Scanner
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanStr = new Scanner(System.in);
    private static Random  random    = new Random();

    // Call other classes
    private static Human human;
    private static ArrayList<Food> foods = new ArrayList<Food>();
    
    
    // Gurobi variables
    private static GRBEnv env;
    private static GRBModel model;
    private static HashMap<Food,GRBVar> GRBVarMap = new HashMap<Food,GRBVar>(); 
    private static ArrayList<Food> chosenFoods = new ArrayList<Food>();
    private static int solCapacity,solPleasure,solMoney;

    // MAIN
    public static void main(String args[]){

        initialize();
        show(4);
        
    }
    


    public static void initialize(){
        // create human
        createHuman();

        // create random Foods
        createFoods(FOOD_COUNT);
        
        // create gurobi
        createGurobi();

    }
    
    public static void createGurobi() {
    	try {
    		
    		// create env and model
			env = new GRBEnv(GUROBI_NAME);
			model = new GRBModel(env);
			
			// Create variables
			createGRBVars();
			
			// Constraint - Money
			moneyContraint();
			
			// Constraint - Capacity
			capacityContraint();
			
			// Set Objective Function
			setObjective();
			
			// Optimize
			model.write(GUROBI_LOG_NAME);
			model.optimize();
			
			// Hold selected foods in arraylist
			getSelectedFoods();
			
			
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void getSelectedFoods() {
    	
    	// Loop all Foods
    	for(Food f : foods) {
    		
    		try {
    			// If it is chosen
				if(GRBVarMap.get(f).get(GRB.DoubleAttr.X) == 1) {
					// append selected foods
					chosenFoods.add(f);
				}
				
			} catch (GRBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}
    	
    	calculateSolutions();
    	
    }
    
    public static void calculateSolutions() {
    	
    	// initialize
    	solCapacity = 0;
    	solMoney 	= 0;
    	solPleasure = 0;
    	
    	// Loop all selected foods
    	for(Food f : chosenFoods){
    		// sum them
    		solCapacity += f.getSatiety();
    		solMoney += f.getCost();
    		solPleasure += f.getPleasure();
    	}
    	
    }
    
    
    // Optional
    public static void clearGRB() {
    	
    	try {
    		model.dispose();
			env.dispose();
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void setObjective() {
    	
    	// Expression
    	GRBLinExpr objFunc = new GRBLinExpr();
    	
    	// generate expression
    	for( Food f : foods) {
    		
    		objFunc.addTerm(f.getPleasure(), GRBVarMap.get(f));
    		
    	}
    	
    	// add constraint
    	try {
    		
			model.setObjective(objFunc,GRB.MAXIMIZE);
			
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static void moneyContraint() {
    	
    	// Expression
    	GRBLinExpr moneyExpression = new GRBLinExpr();
    	
    	// generate expression
    	for( Food f : foods) {
    		
    		moneyExpression.addTerm(f.getCost(), GRBVarMap.get(f));
    		
    	}
    	
    	// add constraint
    	try {
    		
			model.addConstr(moneyExpression, GRB.LESS_EQUAL, human.getMoney(), " Money Constraint" );
			
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static void capacityContraint() {
    	
    	// Expression
    	GRBLinExpr capacityExpression = new GRBLinExpr();
    	
    	// generate expression
    	for( Food f : foods) {
    		
    		capacityExpression.addTerm(f.getSatiety(), GRBVarMap.get(f));
    		
    	}
    	
    	// add constraint
    	try {
    		
			model.addConstr(capacityExpression, GRB.LESS_EQUAL, human.getFoodCapacity(), " Food Capacity Constraint" );
			
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static void createGRBVars() {
    	
    	for (Food f : foods) {
    		
    		try {
    			
				GRBVarMap.put(f, model.addVar(0, 1, 0, GRB.BINARY, f.getName()) ) ;
				
			} catch (GRBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	
    }

    public static void show(int mode){

    	// Show only human
        if (mode == 1){
            System.out.println(human);
            
        // Show only foods
        }else if (mode == 2){
            System.out.println(foods);
            
        // Show both human and foods
        }else if (mode == 3){
            System.out.println(human);
            System.out.println(foods);
            
        // Show result
        }else if(mode == 4) {
        	
        	System.out.println(chosenFoods);
        	System.out.println();
        	System.out.println("Total Money		: " + solMoney);
        	System.out.println("Total Capacity	: " + solCapacity);
        	System.out.println("Total Pleasure	: " + solPleasure);
        	
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
