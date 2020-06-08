package com.mockito.business;

import com.mockito.data.api.TodoService;
import com.mockito.data.api.TodoServiceStub;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {
  @Test
  public void testRetrieveTodosRelatedToSpring_usingAMock() {
    List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    TodoService todoServiceMock = mock(TodoService.class);
    when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
    TodoBusinesImpl todoBusinesImpl = new TodoBusinesImpl(todoServiceMock);
    List<String> filteredTodos = todoBusinesImpl.retrieveTodosRelatedToSpring("Dummy");
    assertEquals(2, filteredTodos.size());
  }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList() {
        List<String> todos = Arrays.asList();
        TodoService todoServiceMock = mock(TodoService.class);
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinesImpl todoBusinesImpl = new TodoBusinesImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinesImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }
}
