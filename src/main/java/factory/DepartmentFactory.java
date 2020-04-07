package factory;

import company.ac.za.studentbookstore.domain.Department;

public class DepartmentFactory
{
    public static Department getDepartment(String id,String department_Name,String description)
    {
        return new Department.Builder()
                             .Id(id)
                             .DepartmentName(department_Name)
                             .Description(description)
                             .build();
    }
}
