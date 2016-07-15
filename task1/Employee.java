package task1;

public class Employee {

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

	void startWorkingDay() {
		this.hoursLeft = HOURS_FOR_WORK_PER_DAY;
	}

	void work(AllWork allWork) {
		if (allWork != null) {
			this.allWork = allWork;
			while (this.hoursLeft != 0 && !this.allWork.isAllWorkDone()) {
				if (allWork.getNextTask() != null) {
					this.currentTask = allWork.getNextTask();
					this.showReport();
					if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
						this.hoursLeft -= this.currentTask.getWorkingHours();
						this.currentTask.setWorkingHours(0);
						System.out.println("	Zadachata: " + this.currentTask.getName() + " e zavyrshena!");

					} else {
						this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
						this.hoursLeft = 0;
					}
				}
			}
		}
	}

	private void showReport() {
		System.out.println(this.name + " zapochva da raboti po: " + this.currentTask.getName());
		
	}

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
