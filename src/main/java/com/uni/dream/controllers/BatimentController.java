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




/*

@WebServlet("/batiments")
public class BatimentController extends HttpServlet {



    private static final long serialVersionUID = 1L;
    //ArrayList<IBatiment> batiments;
    BatimentDao batimenttDAO = new BatimentDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession s = request.getSession();
        if (s.getAttribute("token") == null) {
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("Batiment", this.batimenttDAO.getBatiments());
            request.getRequestDispatcher("/admin/batimentsList.jsp").forward(request, response);
        }
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String action = request.getParameter("action");

        if (action != null && !action.isEmpty()) {
            if (action.equals("save")) {
                IBatiment batimentFactory = new BatimentFactory();
                Batiment batimentObject = batimentFactory.creerBatiment(request.getParameter("genre").toLowerCase());
                batimentObject.setDescription(request.getParameter("description"));
                batimentObject.setEmplacement(request.getParameter("emplacement"));
                batimentObject.setFonctionnalite(request.getParameter("fonctionnalite"));
                batimentObject.setGenre(request.getParameter("genre"));
                batimentObject.setTaille(Integer.parseInt(request.getParameter("taille")));

                String updateIndex = request.getParameter("index_upd");
                if (updateIndex != null && !updateIndex.isEmpty()) {
                    this.batimenttDAO.updateBatiment(batimentObject, Integer.parseInt(updateIndex));
                } else {
                    this.batimenttDAO.insertBatiment(batimentObject);
                }
                response.sendRedirect(request.getContextPath() +"/admin/batimentsList.jsp");
            } else if (action.equals("delete")) {
                int indexDel = Integer.parseInt(request.getParameter("index_del"));
                this.batimenttDAO.deleteBatiment(indexDel);
                response.sendRedirect(request.getContextPath() +"/admin/batimentsList.jsp");
            } else if (action.equals("update")) {
                int updIndex = Integer.parseInt(request.getParameter("index_mod"));
                Batiment batiment = this.batimenttDAO.getBatiment(updIndex);
                request.setAttribute("batiment_update", batiment);
                request.getRequestDispatcher("batimentsList.jsp").forward(request, response);
            } else if (action.equals("reset")) {
                response.sendRedirect(request.getContextPath() +"/admin/batimentsList.jsp");            } else {
                // Handle unknown action
                response.sendRedirect(request.getContextPath() +"/admin/batimentsList.jsp");
            }
        } else {
            // Handle case when no action parameter is provided
            response.sendRedirect(request.getContextPath() +"/admin/batimentsList.jsp");        }
    }

}
*/

