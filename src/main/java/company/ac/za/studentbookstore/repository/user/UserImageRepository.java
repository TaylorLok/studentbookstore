package company.ac.za.studentbookstore.repository.user;

import company.ac.za.studentbookstore.domain.user.UserImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserImageRepository extends JpaRepository<UserImage,String> {
}
