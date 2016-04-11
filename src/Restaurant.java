package orderingSystem;

public class Restaurant extends Thread{
	Food food;
	restaurantReady ready;
	
	public Restaurant(Food food, restaurantReady ready) {
		super();
		this.food = food;
		this.ready = ready;
	}
	public void run(){
		try{
			Thread.sleep((long) (food.getCookingTime() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ready.foodCooked(food);
	}
}
