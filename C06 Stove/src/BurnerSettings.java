
public enum BurnerSettings {
	//enum type settings for the burner
	OFF("OFF"), LOW("LOW"), MEDIUM("MEDIUM"), HIGH("HIGH");
	
	//string for settings
	private String value;
	
	//Constructor to set the setting types
	BurnerSettings(String aValue){
		value = aValue;
	}
	
	//toString function to print burner settings.
	public String toString(){
		
		return value;
	}
}
