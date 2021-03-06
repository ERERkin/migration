package kg.itAcademy.migration.Service;

import kg.itAcademy.migration.Entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAll();

    Message save(Message message);

    void delete(Long id);
}
