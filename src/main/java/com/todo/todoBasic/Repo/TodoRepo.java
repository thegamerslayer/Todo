package com.todo.todoBasic.Repo;

import java.util.List;

import com.todo.todoBasic.entity.Todo;

public interface TodoRepo {

  void saveTodo(Todo todo);
  void deleteTodo(int id);
  Todo getTodo(int id);
  List<Todo> getAllTodos();
  void updateTodo(Todo todo);
  void deleteAllTodos();
}