package se.corneliapersson.app.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.corneliapersson.app.io.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

    UserEntity findByEmail(String email);

    UserEntity findByUserId(String userId);

}
