package com.celia.understandwebappl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/reqForm")
public class RequestFormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String phone = request.getParameter("phone");
        String faculty = request.getParameter("faculty");
        String department = request.getParameter("department");

        request.setAttribute("fullname",fullname);
        request.setAttribute("email",email);
        request.setAttribute("gender",gender);
        request.setAttribute("dob",dob);
        request.setAttribute("phone",phone);
        request.setAttribute("faculty",faculty);
        request.setAttribute("department",department);

        RequestDispatcher rd= request.getRequestDispatcher("/admissionRequest.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
