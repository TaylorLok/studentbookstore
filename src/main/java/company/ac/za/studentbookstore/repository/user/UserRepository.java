package company.ac.za.studentbookstore.repository.user;

import company.ac.za.studentbookstore.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
