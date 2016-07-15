package task1;

public class LetsWork {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		allWork.addTask(new Task("izkopavane na dupka za osnovi", 30));
		allWork.addTask(new Task("byrkane na ciment", 12));
		allWork.addTask(new Task("nalivane na osnovi", 6));
		allWork.addTask(new Task("izlivane na koloni", 4));
		
		Employee pesho = new Employee("Pesho");
		Employee gosho = new Employee("Gosho");
		Employee misho = new Employee("Misho");
		Employee grisho = new Employee("Grisho");
		
		while (allWork.isAllWorkDone()) {
			
		}

	}

}
