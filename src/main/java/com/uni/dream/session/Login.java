package com.uni.dream.session;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        // get request parameters for username and password
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.equals("ouma") && password.equals("ouma")) {


            //get the old session and invalidate
            HttpSession oldSession = request.getSession(false);
            if (oldSession != null) {
                oldSession.invalidate();
            }
            //generate a new session
            HttpSession newSession = request.getSession(true);

            //setting session to expiry in 5 mins
            newSession.setMaxInactiveInterval(5*60);
            newSession.putValue("username", login);

            Cookie message = new Cookie("message", "Welcome");
            response.addCookie(message);
            response.sendRedirect(request.getContextPath() + "/dash");

        } else {
            /*RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
            out.println("<font color=red>Either username or password is wrong.</font>");
            rd.include(request, response);*/
            out.println("fail");
        }
    }
}
