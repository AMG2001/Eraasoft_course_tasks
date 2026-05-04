package com.daif.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/content")
public class InputReceiver extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String fullName =  req.getParameter("fullName");
       int age =  Integer.parseInt(req.getParameter("age"));
       resp.getWriter().println(String.format("Full name : %s & age is : %d",fullName,age));
    }
}
