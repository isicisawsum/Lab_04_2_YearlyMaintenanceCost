//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        int Winter;
        
        int Spring;
        
        int Summer;
        
        int Fall;
        
        int Total; // defining all variables
        
        System.out.println("What is your home maintenance cost in the winter?"); //asking cost for variable Winter
        
        Winter = 150; //Setting value of Winter
        
        System.out.println("You said the home maintenance cost for winter was $" + Winter); //confirming what user 'inputted'
        
        System.out.println("What is your home maintenance cost in the spring?"); //asking cost for variable Spring
        
        Spring = 240; //Setting value of Spring
        
        System.out.println("You said the home maintenance cost for spring was $" + Spring); //confirming what user 'inputted'
        
        System.out.println("What is your home maintenance cost in the summer?"); //asking cost for variable Summer
        
        Summer = 125; //Setting value of Summer
        
        System.out.println("You said the home maintenance cost for summer was $" + Summer); //confirming what user 'inputted'
        
        System.out.println("What is your home maintenance cost in the fall?"); //asking cost for variable Fall
        
        Fall = 240; //Setting value of Fall
        
        System.out.println("You said the home maintenance cost for fall was $" + Fall); //confirming what user 'inputted'
        
        Total = Winter + Spring + Summer + Fall; //calculating the total yearly maintenance cost
        
        System.out.println("Your total home maintenance cost for the year is $" + Total);
    }
}
