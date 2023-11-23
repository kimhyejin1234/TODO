package com.example.todo.todoapi.service;

import com.example.todo.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional // jpa를 쓴다는 아노테이션
public class TodoService {

    private final TodoRepository todoRepository;

}
