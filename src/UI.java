package orderingSystem;

import javax.swing.JOptionPane;

public class UI implements restaurantReady{

	public static void main(String[] args) {

		//list of food
		//pass the order from customer to the restaurant
		UI ui = new UI();
		for(int i=0; i<5; i++)
			ui.promt();
		
	}
	public void promt(){
		Food pizza = new Food("Hawaian pizza", 10.9, 0.2);
		Food cn = new Food("Chicken naggets", 5, 0.2);
		
		Food[] availableFood = new Food[] {pizza, cn};
		for(Food food : availableFood){
			System.out.println(food.getName());
		}
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose your food: "));
		Food selection = availableFood[choice];
		Restaurant restaurant = new Restaurant(selection, this);
		restaurant.start();
	}

	@Override
	public void foodCooked(Food food) {
		System.out.println(food.getName() + ". " + "Your food has been cooked!");
	}

}
