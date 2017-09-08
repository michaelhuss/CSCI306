

public class Burner {

	//enumerated types for temperature settings. 
	public enum Temperature { BLAZING, HOT, WARM, COLD};
	
	//constant value for timer
	public static final int TIME_DURATION = 2;
	
	//variables for burner class
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	
	//burner constructor sets temperature to cold and setting to off
	public Burner() {
		super();
		
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}

	//getter method for burner temperature
	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public void plusButton(){
		
		//switch statement adjusting setting to the next highest
		switch(mySetting){
		
		case OFF:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
			break;
		case HIGH:
			break;
		}
	}
	
	public void minusButton(){
		
		//switch statement adjusting setting to next lowest
		switch(mySetting){
		
		case OFF:
			break;
		case LOW:
			mySetting = Setting.OFF;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		}
	}
	
	
	public void updateTemperature(){
		//write update temp method
		
	}
}
