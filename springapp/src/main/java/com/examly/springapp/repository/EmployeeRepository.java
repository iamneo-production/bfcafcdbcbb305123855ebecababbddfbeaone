
@Repository
public class EmployeeRepository {
    @PersistenceContext
	private EntityManager em;


    public List<Employee> findEmpList() {    
		TypedQuery<Employee> qry = em.createQuery("select e from Employee e where e.salary >?",Employee.class);
     	List<Employee> empList = qry.setParameter(1,salary).getResultList();
		return empList;
	}

}
