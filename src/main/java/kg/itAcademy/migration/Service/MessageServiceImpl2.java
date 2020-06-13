//package kg.itAcademy.migration.Service;
//
//import kg.itAcademy.migration.Entity.Message;
//import kg.itAcademy.migration.Repo.MessageRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MessageServiceImpl2 implements MessageService{
//    @Autowired
//    MessageRepo messageRepo;
//    @Override
//    public List<Message> getAll() {
//        return messageRepo.findAll();
//    }
//
//    @Override
//    public Message save(Message message) {
//        return messageRepo.save(message);
//    }
//
//    @Override
//    public void delete(Long id) {
//        messageRepo.deleteById(id);
//    }
//}
