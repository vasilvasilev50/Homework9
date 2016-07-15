package task1;

public class LetsWork {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		allWork.addTask(new Task("izkopavane na dupka za osnovi", 30));
		allWork.addTask(new Task("byrkane na ciment", 12));
		allWork.addTask(new Task("nalivane na osnovi", 18));
		allWork.addTask(new Task("izlivane na koloni za pyrviqt etaj", 8));
		allWork.addTask(new Task("izlivane na plocha za pyrviqt etaj", 10));
		allWork.addTask(new Task("izlivane na koloni za vtoriqt etaj", 8));
		allWork.addTask(new Task("izlivane na plocha za vtoriqt etaj", 10));
		allWork.addTask(new Task("postavqne na tuhli", 24));
		allWork.addTask(new Task("pokrivna kontrukciq", 48));
		allWork.addTask(new Task("postavqne na prozorci", 13));
		allWork.addTask(new Task("izmazvane na stenite", 16));
		
		
		Personal personal = new Personal(10);
		personal.addPersonal(new Employee("Pesho"));
		personal.addPersonal(new Employee("Gosho"));
		personal.addPersonal(new Employee("Misho"));
		personal.addPersonal(new Employee("Grisho"));
		personal.addPersonal(new Employee("Tisho"));
		
		
		int workingDay = 1;
		while (!allWork.isAllWorkDone()) {
			System.out.println();
			System.out.println("Working day " + workingDay++);	
			for (Employee employee : personal.getEmployees()){
				if (employee != null){
					employee.startWorkingDay();
					employee.work(allWork);
				}
			}
			if (!allWork.isAllWorkDone()){
				System.out.println("Rabotniqt den prikliuchi.");
			} else {
				System.out.println("Vsichki zadachi sa izpylneni!!! Slagaite trapezata i da se pochvame :) ");
			}
		}

	}

}
