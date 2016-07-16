package task1;

public class Personal implements IPersonal{
	
	private static final int MIN_EMPLOYESS = 2;
	private static final int MAX_EMPLUYESS = 20;
	private Employee [] employees;
	private int currentEmployee;


	public Personal(int numberOfEmployees) {
		if (numberOfEmployees > 1 && numberOfEmployees < MAX_EMPLUYESS){
			employees = new Employee[numberOfEmployees];
		} else {
			employees = new Employee[MIN_EMPLOYESS];
		}
	}
	
	@Override
	public void addPersonal (IWork employee) {
		if (employee != null && currentEmployee < this.getEmployees().length) {
			this.employees[currentEmployee++] = (Employee) employee;
		} else {
			System.out.println("No more place for employees");
		}
	}
	
	
//	getters and setters
	public Employee[] getEmployees() {
		return employees;
	}
	


}
