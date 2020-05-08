package se.corneliapersson.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.corneliapersson.app.io.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

}
