package factory.user;

import company.ac.za.studentbookstore.domain.user.UserDepartment;

public class UserDepartmentFactory
{
    public static UserDepartment getUserDept(String email,String department_id,String description)
    {
        return new UserDepartment.Builder()
                                 .email(email)
                                 .departmentId(department_id)
                                 .description(description)
                                 .build();
    }
}
