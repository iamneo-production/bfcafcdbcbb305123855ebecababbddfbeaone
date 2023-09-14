@RestController
public class EmployeeController {
    

    @GetMapping("/api/salary/higher-than/{salary}")
    public List<employee> getEmployeesWithSalaryHigherThan(@PathVariable("salary") float sal)
    {
        

    }


    

}
