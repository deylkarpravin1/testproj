package com.pro.java.demo;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 1;i<=10;i++)
            {
                System.out.println(i);
            }
        };

        r.run();
    }
}

/*public EmployeeService extends JPARepository<Integer,Employee>
{

}

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService eService;

    @GetMappting("/Employees")
    public List<Employee> getAllEmployee()
    {
        return eService.getAllEmployee();
    }
}

spring.profile.active=dev*/
