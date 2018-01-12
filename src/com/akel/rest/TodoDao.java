package com.akel.rest;

import java.util.HashMap;
import java.util.Map;

import com.akel.rest.Todo;

public enum TodoDao {
    instance;

    private Map<String, Todo> contentProvider = new HashMap<>();

    private TodoDao() {

        Todo todo = new Todo("1", "REST");
        todo.setDescription("Heyo");
        contentProvider.put("1", todo);
        todo = new Todo("2", "Do something");
        todo.setDescription("Heyyy");
        contentProvider.put("2", todo);

    }
    public Map<String, Todo> getModel(){
        return contentProvider;
    }

}