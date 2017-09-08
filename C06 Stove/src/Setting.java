
public enum Setting {
	//enum type settings for the burner
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	
	//string for string representation of settings
	private String value;
	
	//Constructor to set the setting types
	Setting(String aValue){
		value = aValue;
	}
	
	//toString function to print burner settings.
	public String toString(){
		return value;
	}
	
	
}
