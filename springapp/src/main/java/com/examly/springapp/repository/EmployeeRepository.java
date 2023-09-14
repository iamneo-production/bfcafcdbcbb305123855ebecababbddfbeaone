package 
@Repository
public class EmployeeRepository extends JpaRepository<Employee,Integer>{
   
       public List<Employee> findEmpList() {    
		TypedQuery<Employee> qry = em.createQuery("select e from Employee e where e.salary >?",Employee.class);
     	List<Employee> empList = qry.setParameter(1,salary).getResultList();
		return empList;
	}

}
