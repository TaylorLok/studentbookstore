package company.ac.za.studentbookstore.repository.picture;

import company.ac.za.studentbookstore.domain.picture.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Picture,String> {
}
