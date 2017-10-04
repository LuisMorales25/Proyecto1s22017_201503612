package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #1b6d85\">\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("        \t\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 form-box\">\n");
      out.write("                        \t\n");
      out.write("                            <div class=\"form-bottom\" style=\"float:left;\">\n");
      out.write("                                <form action=\"carpeta\"  method=\"POST\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("\t\t\t                    \t\t\n");
      out.write("                                \t<input type=\"text\" name=\"txtcarpeta\" placeholder=\"carpeta\" >\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t           \n");
      out.write("                                   ");
      out.write("\n");
      out.write("\t\t\t            <button type=\"submit\"  class=\"btn\"  onclick=\"location.href = 'login.jsp'\">Crear Carpeta!</button> \n");
      out.write("                                     <a href=\"subir.jsp\">subir Archivo!</a>\n");
      out.write("\t\t\t        </form>\n");
      out.write("                                    <br>\n");
      out.write("                                    \n");
      out.write("                                   ");
      out.write("\n");
      out.write("\t\t            </div>\n");
      out.write("                              <div class=\"form-bottom\" style=\"float:right;\">\n");
      out.write("                                <form action=\"archivo\"  method=\"POST\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("\t\t\t                    \t\t\n");
      out.write("                                \t<input type=\"text\" name=\"txtarchivo\" placeholder=\"archivo\" >\n");
      out.write("                                    </div>\n");
      out.write("                                      <div class=\"form-group\">\n");
      out.write("\t\t\t                    \t\t\n");
      out.write("                                \t<input type=\"text\" name=\"txtusuer\" placeholder=\"destinatario\" >\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t           \n");
      out.write("                                   \n");
      out.write("\t\t\t            <button type=\"submit\"  class=\"btn\"  onclick=\"location.href = 'login.jsp'\">Subir archivo!</button> \n");
      out.write("                                     <a href=\"descarga.jsp\">descargar!</a>\n");
      out.write("\t\t\t        </form>\n");
      out.write("                                  \n");
      out.write("                                   \n");
      out.write("                                \n");
      out.write("\t\t            </div>\n");
      out.write("                                  <a href=\"reportes.jsp\">reportes!</a>    \n");
      out.write("                               \n");
      out.write("                              \n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
