package company.ac.za.studentbookstore.repository.user;

import company.ac.za.studentbookstore.domain.user.UserDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDepartmentRepository extends JpaRepository<UserDepartment,String> {
}
