package repository;

import company.ac.za.studentbookstore.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,String> {
}
