package forest.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Diet {
	private String foodItem;
	private boolean isMeat;
	
	public Diet() {
		this.isMeat = false;	
	}
	
	public Diet(String foodItem, boolean isMeat) {
		super();
		this.foodItem = foodItem;
		this.isMeat = isMeat;
	}
	
	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public boolean isMeat() {
		return isMeat;
	}

	public void setMeat(boolean isMeat) {
		this.isMeat = isMeat;
	}
	
	@Override
	public String toString() {
		String meat = "not meat";
		if(isMeat() == true)
			meat = "meat";		
		
		return foodItem + " (" + meat + ")";
	}
}
