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

            todos.add("SR�� ���� ���� ������");
            todos.add("��Ϸ�����");
            todos.add("ģ���� �ָ��� ���͵�");
            todos.add("VIPS����");
            todos.add("Plalab �����ϱ�");
            todos.add("��Ÿ���� ī�������ϱ�");
            todos.add("UX�����ϱ�");

            return todos;

        } catch (Exception e) {
            throw e;

        } finally {
            //destory database connection
        }
    }

}