package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrafuncionarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">        \n");
      out.write("        <link href=\"/estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Cadastro de Funcionários</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\" style=\"text-align: center;\"><h1>Controle de EPI - Equipamento de Proteção Individual</h1></div>\n");
      out.write("        <div id=\"content\" style= \"text-align: center;\"><h1>Cadastro de Funcionários</h1></div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <form action=\"ControllerServlet\" method=\"post\">                \n");
      out.write("               <fieldset id=\"login\">\n");
      out.write("               <legend><span>Dados Pessoais</span></legend>\n");
      out.write("                    <ol>\n");
      out.write("                         <li>\n");
      out.write("                             <label for=\"nome\" title=\"Informe Nome\"> Nome Completo:<span>*</span></label><input type=\"text\" name=\"name\">\n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                           <label for=\"cpf\" title=\"Informe CPF\"> CPF:<span>*</span></label><input type=\"text\" name=\"cpf\"> \n");
      out.write("                         </li> \n");
      out.write("                         \n");
      out.write("                         <li>\n");
      out.write("                           <label for=\"matricula\" title=\"Informe Matrícula\"> Matrícula:<span>*</span></label><input type=\"text\" name=\"mat\"> \n");
      out.write("                         </li>\n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("                     </ol>\n");
      out.write("               </fieldset>               \n");
      out.write("               <fieldset>\n");
      out.write("                     <legend><span>Técnico Segurança</span></legend>\n");
      out.write("                    <ol>\n");
      out.write("                         <li>\n");
      out.write("                             <label for=\"login\" title=\"Informe Login\"> Login:<span></span></label><input type=\"text\" name=\"login\">\n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                           <label for=\"password\" title=\"Informe Senha\"> Senha:<span></span></label><input type=\"password\" name=\"psw\"> \n");
      out.write("                         </li> \n");
      out.write("                         <li>\n");
      out.write("                           <label for=\"crea\" title=\"Informe Nº CREA\"> C.R.E.A:<span>*</span></label><input type=\"text\" name=\"crea\"> \n");
      out.write("                         </li>                \n");
      out.write("                         \n");
      out.write("                     </ol>\n");
      out.write("               </fieldset> \n");
      out.write("                <fieldset >\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=\"create\"></input>\n");
      out.write("                    <input type=\"submit\" value=\"Cadastrar\">   \n");
      out.write("                    <a href=\"default.jsp\"> Cancelar</a>                 \n");
      out.write("                </fieldset>\n");
      out.write("                \n");
      out.write("            </form> \n");
      out.write("          </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
