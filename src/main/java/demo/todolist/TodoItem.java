package demo.todolist;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String header;
    private String body;
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @Enumerated(EnumType.STRING)
    private Status status;
}
