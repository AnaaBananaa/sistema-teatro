package teatro.teatros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teatro.teatros.entities.Teatro;

@Repository
public interface TeatroRepository extends JpaRepository<Teatro, Long> {
}
