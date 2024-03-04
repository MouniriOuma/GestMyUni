package com.uni.dream.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet("/batiment")
public class BatimentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case "new":
                showNewForm(request, response);
                break;
            case "insert":
                insertBatiment(request, response);
                break;
            case "delete":
                deleteBatiment(request, response);
                break;
            default:
                // Handle default action
                break;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to show the form for adding a new batiment
        request.getRequestDispatcher("/batimentForm.jsp").forward(request, response);
    }

    private void insertBatiment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to insert a new batiment into the database
        // This method should handle form submission data and interact with the DAO to insert the batiment
        // After insertion, redirect the user to a relevant page
        response.sendRedirect(request.getContextPath() + "/batiment?action=new");
    }

    private void deleteBatiment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to delete a batiment from the database
        // This method should handle the ID of the batiment to be deleted and interact with the DAO to perform deletion
        // After deletion, redirect the user to a relevant page
        response.sendRedirect(request.getContextPath() + "/batiment?action=new");
    }
}



