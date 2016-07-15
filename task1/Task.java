package task1;

public class Task {
	
	private String name;
	private float workingHours;
	
	Task (String name, float workingHours) {
		if (name != null && !name.equals("")){
			this.name = name;
		}	
		this.workingHours = (workingHours > 0 ) ? workingHours : 0;
	}

	public String getName() {
		return name;
	}

	public float getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(float workingHours) {
		if (workingHours >= 0)
		this.workingHours = workingHours;
	}
	
	

}
