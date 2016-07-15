package task1;

public class AllWork {

	private static final int ALL_PLACES_FOR_TASTKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int correntUnassignedTask;

	AllWork() {
		freePlacesForTasks = ALL_PLACES_FOR_TASTKS;
		tasks = new Task [ALL_PLACES_FOR_TASTKS];
	}

	void addTask(Task task) {
		if (task != null) {
			if (correntUnassignedTask < ALL_PLACES_FOR_TASTKS && this.tasks[correntUnassignedTask] == null) {
			this.tasks[correntUnassignedTask++] = task;
			freePlacesForTasks--;
			return;
			}
			System.out.println("No more free places for tasks!");
		}
	}
	
	Task getNextTask () {
		for (Task task : tasks){
			if (task != null && task.getWorkingHours() > 0) {
				return task;
			}
		}
		return null;
	}
	
	boolean isAllWorkDone () {
		for (Task task : tasks){
			if (task.getWorkingHours() != 0){
				return false;
			}
		}
		return true;
	}

}
