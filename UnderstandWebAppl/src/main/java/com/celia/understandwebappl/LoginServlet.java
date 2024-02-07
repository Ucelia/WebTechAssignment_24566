package com.celia.understandwebappl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        if(username.equals("Celia")&& password.equals("12345")){
            request.setAttribute("username","User :"+username);
            RequestDispatcher rd =  request.getRequestDispatcher("/requestForm.jsp");
            try {
                rd.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            request.setAttribute("error","Invalid Credentials!");
            RequestDispatcher rd =  request.getRequestDispatcher("/login.jsp");
            try {
                rd.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
