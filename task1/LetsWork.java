package task1;

public class LetsWork {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		
		allWork.addTask(new Task("Task 1", 30));
		allWork.addTask(new Task("Task 2", 12));
		allWork.addTask(new Task("Task 3", 18));
		allWork.addTask(new Task("Task 4", 4));
		allWork.addTask(new Task("Task 5", 10));
		allWork.addTask(new Task("Task 6", 8));
		allWork.addTask(new Task("Task 7", 10));
		allWork.addTask(new Task("Task 8", 24));
		allWork.addTask(new Task("Task 9", 48));
		allWork.addTask(new Task("Task 10", 13));
		allWork.addTask(new Task("Task 11", 16));
		
		Employee [] employees = {new Employee("Pesho"), new Employee("Gosho"), new Employee("Misho"), 
								new Employee("Grisho"), new Employee("Tisho")};
		
		
		
		
		int workingDay = 1;
		while (!allWork.isAllWorkDone()) {
			System.out.println();
			System.out.println("Working day " + workingDay++);	
			for (Employee employee : employees){
				if (employee != null){
					employee.startWorkingDay();
					employee.setAllWork(allWork);
					employee.work();
				}
			}
			if (!allWork.isAllWorkDone()){
				System.out.println("  The working day is over.");
			} else {
				System.out.println("All tasks are finished!!! Slagaite trapezata i da se pochvame :) ");
			}
		}

	}

}
