package demo.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoItemRepository  extends JpaRepository<TodoItem, Integer> {
    List<TodoItem> findTodoItemByHeader(String header);
}
