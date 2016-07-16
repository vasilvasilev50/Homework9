package task1;

public class LetsWork {

	public static void main(String[] args) {
		
		Workable allWork = new AllWork();
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
		
		
		IPersonal personal = new Personal(5);
		personal.addPersonal(new Employee("Pesho"));
		personal.addPersonal(new Employee("Gosho"));
		personal.addPersonal(new Employee("Misho"));
		personal.addPersonal(new Employee("Grisho"));
		personal.addPersonal(new Employee("Tisho"));
		
		
		int workingDay = 1;
		while (!allWork.isAllWorkDone()) {
			System.out.println();
			System.out.println("Working day " + workingDay++);	
			for (IWork employee : ((Personal) personal).getEmployees()){
				if (employee != null){
					employee.startWorkingDay();
					employee.work(allWork);
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
