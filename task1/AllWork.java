package task1;

public class AllWork implements Workable{

	private static final int ALL_PLACES_FOR_TASTKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int correntUnassignedTask;
	

	AllWork() {
		freePlacesForTasks = ALL_PLACES_FOR_TASTKS;
		tasks = new Task [ALL_PLACES_FOR_TASTKS];
	}
	
	@Override
	public void addTask(Task task) {
		if (task != null) {
			if (freePlacesForTasks > 0 && this.tasks[ALL_PLACES_FOR_TASTKS - freePlacesForTasks] == null) {
			this.tasks[ALL_PLACES_FOR_TASTKS - freePlacesForTasks--] = task;
			return;
			}
			System.out.println("No more free places for tasks!");
		}
	}
	
	
	@Override
	public boolean isAllWorkDone () {
		for (Task task : tasks){
			if (task != null){
				if (task.getWorkingHours() != 0){
					return false;
				}
			} 
		}
		return true;
	}
	
	Task getNextTask () {
		if (correntUnassignedTask < tasks.length){
			return tasks[correntUnassignedTask];
		}
		return null;
	}
	
	
//	getters and setters
	public int getCorrentUnassignedTask() {
		return correntUnassignedTask;
	}

	public void setCorrentUnassignedTask() {
		this.correntUnassignedTask++;
	}

}
