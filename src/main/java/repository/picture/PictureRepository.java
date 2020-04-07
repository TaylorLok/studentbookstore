package repository.picture;

import company.ac.za.studentbookstore.domain.picture.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture,String> {
}
