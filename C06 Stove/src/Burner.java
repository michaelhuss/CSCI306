import java.lang.*;

public class Burner {

	//enumerated types for temperature settings. 
	public enum Temperature { COLD, WARM, HOT, BLAZING};
	
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
		timer = 0;
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
	
	public void plusTemp(){
		
		//increases temperature by one setting 
		switch(myTemperature){
		
		case COLD:
			myTemperature = Temperature.WARM;
			break;
		case WARM:
			myTemperature = Temperature.HOT;
			break;
		case HOT:
			myTemperature = Temperature.BLAZING;
			break;
		case BLAZING:
			break;
		}
	}
	
	public void minusTemp(){
		
		//decreases temp by one setting
		switch(myTemperature){
		
		case COLD:
			break;
		case WARM:
			myTemperature = Temperature.COLD;
			break;
		case HOT:
			myTemperature = Temperature.WARM;
			break;
		case BLAZING:
			myTemperature = Temperature.HOT;
			break;
		}
		
	}
	
	
	public void updateTemperature(){
		
		timer++;
		
		//nested if statements that checks if two minutes have passed, then will check if temp is at desired setting
		if(timer % TIME_DURATION == 0){
			if(myTemperature.ordinal() < mySetting.ordinal()){
				plusTemp();
			}
			else if(myTemperature.ordinal() > mySetting.ordinal()){
				minusTemp();
			}
		}
	}
}
