package com.web.plalab.controller;
import com.web.plalab.model.TodoListDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/todo/list")
public class MainController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ServletContext sc = this.getServletContext();
            TodoListDAO todoListDAO = new TodoListDAO();

            request.setAttribute("todoList", todoListDAO.lookupTodoList());

            response.setContentType("text/html; charset=UTF-8");
            RequestDispatcher rd = request.getRequestDispatcher("/todo/TodoList.jsp");
            rd.include(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", e);
            RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }
    }
}