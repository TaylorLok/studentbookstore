package repository.user;

import company.ac.za.studentbookstore.domain.user.UserDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDepartmentRepository extends JpaRepository<UserDepartment,String> {
}
