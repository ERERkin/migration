package kg.itAcademy.migration.Repo;

import kg.itAcademy.migration.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
}
