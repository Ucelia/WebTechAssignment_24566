package com.celia.understandwebappl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/conversion")
public class ConvServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            String numberParam = request.getParameter("number");
            if (numberParam == null || numberParam.trim().isEmpty()) {
                request.setAttribute("error", "Number to be converted is required!");
            } else {
                int number = Integer.parseInt(numberParam);
                String username = request.getParameter("username");
                String myBtn = request.getParameter("btn");
                String convertedNumber;
                String description;
                request.setAttribute("numberToConvert", "Number " + number);

                if (myBtn.equals("binary")) {
                    StringBuilder binaryStringBuilder = new StringBuilder();
                    while (number > 0) {
                        int remainder = number % 2;
                        binaryStringBuilder.insert(0, remainder);
                        number = number / 2;
                    }
                    convertedNumber = binaryStringBuilder.toString();
                    description = "Decimal number converted to binary";
                } else if (myBtn.equals("hexa")) {
                    StringBuilder hexStringBuilder = new StringBuilder();
                    while (number > 0) {
                        int remainder = number % 16;
                        char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder + 'A' - 10);
                        hexStringBuilder.insert(0, hexDigit);
                        number = number / 16;
                    }
                    convertedNumber = hexStringBuilder.toString();
                    description = "Decimal number converted to Hexadecimal";

                } else if (myBtn.equals("octal")) {
                    StringBuilder octalStringBuilder = new StringBuilder();
                    while (number > 0) {
                        int remainder = number % 8;
                        octalStringBuilder.insert(0, remainder);
                        number = number / 8;
                    }
                    convertedNumber = octalStringBuilder.toString();
                    description = "Decimal number converted to Octal";
                } else {
                    convertedNumber = Integer.toString(number);
                    description = "Decimal number not converted";
                }
                request.setAttribute("convertedNumber", "Result " + convertedNumber);
                request.setAttribute("description", description);
                request.setAttribute("username", username);
            }

        } catch (NumberFormatException ex){
            request.setAttribute("error", "Invalid number format! Please enter a valid integer.");
        } catch (Exception ex){
            ex.printStackTrace();
            request.setAttribute("error", "Unexpected error occurred!");
        }
        RequestDispatcher dispatch = request.getRequestDispatcher("/converter.jsp");
        try {
            dispatch.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
