package demo.todolist;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TodoListController{

    private final TodoItemRepository todoItemRepository;

    @GetMapping("/todo")
    public List<TodoItem> getTodoItems(){
        return todoItemRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public Optional<TodoItem> getTodoItemById(@PathVariable int id){
        return todoItemRepository.findById(id);
    }

    @PostMapping("/todo")
    public void createTodoItem(@RequestBody TodoItem todoItem){
        todoItemRepository.save(todoItem);
    }

    @PutMapping("/todo")
    public void editTodoItem(@RequestBody TodoItem todoItem){
        todoItemRepository.save(todoItem);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodoItem(@PathVariable int id){
        todoItemRepository.deleteById(id);
    }
}
