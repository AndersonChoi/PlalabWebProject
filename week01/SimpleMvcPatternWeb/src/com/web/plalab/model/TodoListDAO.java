package com.web.plalab.model;

import java.util.ArrayList;
import java.util.List;

public class TodoListDAO {

    public TodoListDAO(){
        //init database connection
    }

    public List<String> lookupTodoList() throws Exception {

        try {
            ArrayList<String> todos = new ArrayList<>();

            todos.add("SR건 빨리 빨리 끝내기");
            todos.add("운동하러가기");
            todos.add("친구랑 주말에 스터디");
            todos.add("VIPS가기");
            todos.add("Plalab 공부하기");
            todos.add("스타벅스 카드충전하기");
            todos.add("UX공부하기");

            return todos;

        } catch (Exception e) {
            throw e;

        } finally {
            //destory database connection
        }
    }

}