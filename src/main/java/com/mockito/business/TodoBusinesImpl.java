package com.mockito.business;

import com.mockito.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

//SUT system under test
// TodoService  Dependency
public class TodoBusinesImpl {
    private TodoService todoService;

    public TodoBusinesImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}
