

import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.Test;

import com.java.dao.ProjectRepositoryImpl;
import com.java.model.*;


public class ProjectSystem {
	@Test
	public void test_1() {
		ProjectRepositoryImpl pri=new ProjectRepositoryImpl();
		Employee e=new Employee();
		e.setId(3);
		e.setName("Testing");
		e.setDesignation("For Testing");
		e.setGender("Male");
		e.setSalary(30000.0);
		e.setProject_id(12);
		
		boolean result=pri.createEmployee(e);
		assertTrue(result, "Employee creation Successful");
		
	}
	
	@Test
	void test_2() {
		ProjectRepositoryImpl pri=new ProjectRepositoryImpl();
        Task t = new Task();
        t.setTask_id(128);
        t.setTask_name("Test task");
        t.setProject_id(12);
        t.setEmployee_id(123);
        t.setStatus("Assigned");

        boolean result =pri.createTask(t);
        assertTrue(result, "Task creation successful");
    }

}
