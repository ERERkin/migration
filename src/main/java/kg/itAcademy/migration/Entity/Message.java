package kg.itAcademy.migration.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "test_migF_message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "text")
    String text;
}
