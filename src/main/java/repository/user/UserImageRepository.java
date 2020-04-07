package repository.user;

import company.ac.za.studentbookstore.domain.user.UserImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<UserImage,String> {
}
