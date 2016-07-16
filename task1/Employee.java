package task1;

public class Employee implements IWork  {

	private static final int HOURS_FOR_WORK_PER_DAY = 8;
	private String name;
	private Task currentTask;
	private float hoursLeft;
	private AllWork allWork;

	Employee(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}
	
	@Override
	public void startWorkingDay() {
		this.hoursLeft = HOURS_FOR_WORK_PER_DAY;
	}

	@Override
	public void work (Workable allWork) {
		if (allWork != null) {
			this.allWork = (AllWork) allWork;
			while (this.hoursLeft != 0) {
				if (this.currentTask != null && this.currentTask.getWorkingHours() > 0) {
					this.showReport();
					calculateHoursLeft();
				} else {
					if (((AllWork) allWork).getNextTask() != null) {
						this.currentTask = ((AllWork) allWork).getNextTask();
						((AllWork) allWork).setCorrentUnassignedTask();
						this.showReport();
						calculateHoursLeft();
					} else {
						return;
					}

				}
			}
		}
	}

	private void calculateHoursLeft() {
		if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
			System.out.println("	" + this.currentTask.getName() + " is finished!");

		} else {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
		}
	}

	private void showReport() {
		System.out.println(this.name + " work on: " + this.currentTask.getName() + " (remain " + this.currentTask.getWorkingHours() + " hours)");

	}

	
//	getters and setters
	public Task getCurrentTask() {
		return currentTask;
	}

	public float getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(float hoursLeft) {
		this.hoursLeft = (hoursLeft > 0) ? hoursLeft : 0;
	}

	public String getName() {
		return name;
	}


}
