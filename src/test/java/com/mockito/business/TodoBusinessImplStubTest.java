package com.mockito.business;

import com.mockito.data.api.TodoService;
import com.mockito.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {
    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoService todoServiceStub= new TodoServiceStub();
        TodoBusinesImpl todoBusinesImpl = new TodoBusinesImpl(todoServiceStub);
        List<String> filteredTodos= todoBusinesImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filteredTodos.size());
        }


    }

