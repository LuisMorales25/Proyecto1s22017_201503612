/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

/**
 *
 * @author jrglu
 */
@WebServlet(name = "nuevoUser", urlPatterns = {"/nuevoUser"})
public class nuevoUser extends HttpServlet {

     public static OkHttpClient webClient = new OkHttpClient();
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              String _user=request.getParameter("txtusuario");
            String contra=request.getParameter("txtpass");
           try {
                RequestBody formBody = new FormEncodingBuilder()
                .add("user", _user)
                .add("password", contra)
                .build();
        String r = getString("insertarUser", formBody); 
        System.out.println(r + "---");
               if (r.equals("valido")) { 
                   response.sendRedirect("login.jsp");
                   out.println("correcto");
               }else if (r.equals("FalsePass")) {
                   out.println("contraseña invalida");
               }else if (r.equals("FalseUser")) {
                   out.println("usuario ya existe");
               }
                    
//                if (_user!=null) {
//                    if (_user.equals("asd") && contra.equals("123")) {
//                        out.println("al fin");
//                    }else {
//                        out.println("Login fallo");
//                    }
//                }
            } catch (Exception ex) {
                out.println("Error: "+ex.getMessage());
            }
        }
    }

    
    public static String getString(String metodo, RequestBody formBody) {

        try {
            URL url = new URL("http://localhost:5000/" + metodo);
            Request request = new Request.Builder().url(url).post(formBody).build();
            Response response = webClient.newCall(request).execute();//Aqui obtiene la respuesta en dado caso si hayas pues un return en python
            String response_string = response.body().string();//y este seria el string de las respuesta
            return response_string;
        } catch (MalformedURLException ex) {
         //   java.util.logging.Logger.getLogger(testwebserver.TestWebServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
           // java.util.logging.Logger.getLogger(testwebserver.TestWebServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
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
