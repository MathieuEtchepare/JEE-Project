/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DataAccess;
import model.userSession;

/**
 *
 * @author Kilian
 */
public class AddtoBDD extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
        String name = request.getParameter("name");
        String firstname = request.getParameter("firstname");
        String home_phone = request.getParameter("home_phone");
        String mobile_phone = request.getParameter("mobile_phone");
        String pro_phone = request.getParameter("pro_phone");
        String address = request.getParameter("address");        
        String zip_code = request.getParameter("zip_code");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String id = request.getParameter("id");
        String choice = request.getParameter("choice");
        
        if(login == null || pwd == null){
            request.getRequestDispatcher("WEB-INF/complete_form.jsp").forward(request, response);
        }
        else{
            if(login.equals("") || pwd.equals("")){
            request.setAttribute("ErrMessage", "<p>You must enter values in both fields</p>");
            request.getRequestDispatcher("WEB-INF/complete_form.jsp").forward(request, response);
            }
            else
            {
                //Créer un utilisateur avec les identifiants rentrés
                userSession user = new userSession();
                user.setLogin(login);
                user.setPassword(pwd);
                
                DataAccess dTransac = new DataAccess(); 
                String query = "SELECT LOGIN, PWD FROM CREDENTIALS";
                ArrayList <userSession> userlist = dTransac.getDBUsers(dTransac.getResultSet(dTransac.getStatement(dTransac.getConnection()), query));
                for(userSession u : userlist)
                {
                    if(u.equals(user))
                    {
                        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request, response);
                    }
                }
                request.setAttribute("ErrMessage", "<p>Verify your login/password and try again! </p>");
                request.getRequestDispatcher("WEB-INF/complete_form.jsp").forward(request, response);
                
                
            } 
        } 
        out.close();
        }
        
        
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws OException if an I/O error occurs
     *//*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     *//*
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/
}
