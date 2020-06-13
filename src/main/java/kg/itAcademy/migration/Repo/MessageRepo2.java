package kg.itAcademy.migration.Repo;

import kg.itAcademy.migration.Entity.Message;
import kg.itAcademy.migration.Entity.Message2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo2 extends JpaRepository<Message2, Long> {
}
