/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.epicontrol.Controller;

import br.epicontrol.Model.Funcionario;
import br.epicontrol.Persistence.PersistenciaFuncionario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre Bessa
 */
@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet"})
public class ControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        
        if (request.getParameter("ac").equals("create")) 
        {
            Funcionario funcionario = new Funcionario(); 
            funcionario.setCodigo(null);
            funcionario.setNome(request.getParameter("name"));
            funcionario.setCpf(request.getParameter("cpf"));
            funcionario.setMatricula(Integer.parseInt(request.getParameter("mat")));
            funcionario.setTipoFuncionario(2);


            if(!request.getParameter("login").equals(""))
            {
              funcionario.setLogin(request.getParameter("login"));
              funcionario.setSenha(request.getParameter("psw"));
              funcionario.setCrea(request.getParameter("crea"));
              funcionario.setTipoFuncionario(1);
            }

            PersistenciaFuncionario pf = null;
            
            try 
            {
               PersistenciaFuncionario ps = new PersistenciaFuncionario();
               ps.createFuncionario(funcionario); 
               request.getRequestDispatcher("default.jsp").include(request, response);


            } catch (Exception ex) {
                //System.err.println("Mensagem de erro é: " + ex.getMessage() );
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (request.getParameter("ac").equals("update"))
        {
            Funcionario funcionario = new Funcionario(); 
            funcionario.setCodigo(Integer.parseInt(request.getParameter("codigo")));
            funcionario.setNome(request.getParameter("nome"));
            funcionario.setCpf(request.getParameter("cpf"));
            funcionario.setMatricula(Integer.parseInt(request.getParameter("matricula")));            
            funcionario.setLogin(request.getParameter("login"));
            funcionario.setSenha(request.getParameter("senha"));
            funcionario.setCrea(request.getParameter("crea"));
            funcionario.setTipoFuncionario(Integer.parseInt(request.getParameter("tipo")));  
            
                 
            try 
            {
                
                PersistenciaFuncionario ps = new PersistenciaFuncionario();
                ps.updateFuncionario(funcionario);                
                request.getRequestDispatcher("manutencaofuncionarios.jsp").include(request, response);


            } catch (Exception ex) 
            {
                //System.err.println("Mensagem de erro é: " + ex.getMessage() );
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }        
        else
        {
            if (request.getParameter("ac").equals("delete"))
            {
          
                try 
                {

                  PersistenciaFuncionario pf = new PersistenciaFuncionario();
                  Funcionario funcionario = pf.searchById(Integer.parseInt(request.getParameter("codigo"))); 
                  pf.removeFuncionario(funcionario);                   
                  request.getRequestDispatcher("manutencaofuncionarios.jsp").include(request, response);


                } catch (Exception ex) 
                {
                    
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
        }
               
       
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
