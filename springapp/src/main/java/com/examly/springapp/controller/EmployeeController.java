@RestController
public class EmployeeController {
    

    @GetMapping("/api/salary/higher-than/{salary}")
    public List<employee> getEmployeesWithSalaryHigherThan(@RequestParam("salary") float psalary)
    {

    }


    

}
