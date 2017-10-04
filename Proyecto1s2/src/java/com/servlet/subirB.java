/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import static com.servlet.subir.getString;
import static com.servlet.subir.webClient;
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
import java.io.File;
import javax.swing.JOptionPane;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.regex.Pattern;

/**
 *
 * @author jrglu
 */
@WebServlet(name = "subirB", urlPatterns = {"/subirB"})
public class subirB extends HttpServlet {
    public static OkHttpClient webClient = new OkHttpClient();
int con=0;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                       System.out.println("valor de publica: "+ingresar.carpetaUser);
            /* TODO output your page here. You may use following sample code. */
         String archivo=request.getParameter("txtarchivo");
         String carpeta=request.getParameter("txtcarpeta");
           
            try {
                 RequestBody formBody = new FormEncodingBuilder()
                .add("archivo", archivo)
                .add("user",ingresar.carpetaUser)
                .add("carpeta", carpeta)
                .build();
        String r = getString("nuevaArchivoCarpeta", formBody); 
                //System.out.println("jajajajajajajajajajaja");
        System.out.println(r + "---");
                if (r.equals("invalido")) {
                    //response.sendRedirect("inicio.jsp");
                    out.println("nel chavo");
                    
                }else{
                    
                    //out.println("funciono");
                    File directorio = new File("C:\\Users\\jrglu\\Desktop\\EstructurasP1\\CarpetaDrive"+ingresar.carpetaUser+"\\"+carpeta+"\\"+r); 
                    if (directorio.exists()) {
                        con++;
                        String str = Integer.toString(con);
                        String[] parts = r.split(Pattern.quote("."));
                        String parte1=parts[0];
                        String parte2=parts[1];
                        System.out.println("parte1: "+parte1);
                        System.out.println("parte2: "+parte2);
                        File aux= new File("C:\\Users\\jrglu\\Desktop\\EstructurasP1\\CarpetaDrive"+ingresar.carpetaUser+"\\"+carpeta+"\\"+parte1+str+"."+parte2);
                        aux.createNewFile();
                        //JOptionPane.showMessageDialog(subir.jsp, "el archivo ");
                    }else{
                        directorio.createNewFile();
                    }
                     
                    
                   //
                   //ingresar.carpetaUser="";
                    //Nuevacarpetauser="";
                }
        
                   // response.sendRedirect("login.jsp");
            } catch (Exception e) {
                  out.println("Error: "+e.getMessage());
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
