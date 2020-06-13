package kg.itAcademy.migration.Controller;

import kg.itAcademy.migration.Entity.Message;
import kg.itAcademy.migration.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/m")
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping
    List<Message> getAll(){
        return messageService.getAll();
    }

    @PostMapping
    Message save(@RequestBody Message message){
        return messageService.save(message);
    }

    @DeleteMapping
    void deleteById(Long id){
        messageService.delete(id);
    }
}
