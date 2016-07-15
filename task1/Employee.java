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

	void work() {
		while (this.hoursLeft != 0 || !this.allWork.isAllWorkDone()) {
			this.currentTask = allWork.getNextTask();
			if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);

			} else {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			}
			this.showReport();
		}
	}

	private void showReport() {
		System.out.println("Rabotnik: " + this.name);
		System.out.println("Zadacha: " + this.currentTask.getName());
		System.out.print("Rabotnika ima oshte " + this.hoursLeft + " v koito moje da raboti.");
		if (this.hoursLeft > 0) {
			System.out.print(" Daite na " + this.name + " oshte rabota!");
		}
		System.out.println();
		System.out.println(
				"Ostavat " + this.currentTask.getWorkingHours() + " rabotni chasa dokato se zavarshi zadachata.");
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	// public void setCurrentTask(Task currentTask) {
	// if (currentTask != null)
	// this.currentTask = currentTask;
	// }

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
