package styudy.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import styudy.data_jpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
