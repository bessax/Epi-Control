package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import br.epicontrol.Model.Funcionario;
import br.epicontrol.Persistence.PersistenciaFuncionario;

public final class manutencaofuncionarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      br.epicontrol.Persistence.PersistenciaFuncionario funcionarioBean = null;
      synchronized (session) {
        funcionarioBean = (br.epicontrol.Persistence.PersistenciaFuncionario) _jspx_page_context.getAttribute("funcionarioBean", PageContext.SESSION_SCOPE);
        if (funcionarioBean == null){
          funcionarioBean = new br.epicontrol.Persistence.PersistenciaFuncionario();
          _jspx_page_context.setAttribute("funcionarioBean", funcionarioBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>        \n");
      out.write("        <title>Página de Manutenção</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\" style= \"text-align: center;\"><h1>&nbsp;&nbsp;&nbsp;Controle de EPI - Equipamento de Proteção Individual</h1></div>\n");
      out.write("        <div id=\"content\" style= \"text-align: center;\"><h1>Manutenção de Funcionários</h1></div>\n");
      out.write("        <div id=\"content\" style= \"text-align: center;\">\n");
      out.write("            <form action=\"action\">\n");
      out.write("                <table width=\"100%\" border=\"1px\" bgcolor=\"#CCC\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Código</td>\n");
      out.write("                        <td>Nome</td>\n");
      out.write("                        <td>Matrícula</td>\n");
      out.write("                        <td>C.P.F.</td>\n");
      out.write("                        <td>Login</td>\n");
      out.write("                         <td>Senha</td>\n");
      out.write("                        <td>Crea</td>\n");
      out.write("                        <td>Tipo</td>\n");
      out.write("                        <td>Ação</td>\n");
      out.write("                    </tr>\n");
      out.write("                        \n");
      out.write("                    <!-- Retrive de funcionarios-->    \n");
      out.write("                       ");
 
                        Integer codigo,i,matricula,tipo;
                        String nome,cpf,login,senha,crea ;
                        PersistenciaFuncionario pf= new PersistenciaFuncionario();
                        List<Funcionario>lista = pf.getAll();
                        i=0;
                        while (i <=lista.size()-1)
                        {
                         codigo = lista.get(i).getCodigo();
                         nome = lista.get(i).getNome();
                         matricula = lista.get(i).getMatricula();
                         cpf = lista.get(i).getCpf();
                         login = lista.get(i).getLogin();
                         senha= lista.get(i).getSenha();
                         crea= lista.get(i).getCrea();
                         tipo = lista.get(i).getTipoFuncionario();
                          i++;                        
                       
      out.write("\n");
      out.write("                         \n");
      out.write("                       <tr>\n");
      out.write("                            <td>");
      out.print(codigo);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nome);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(matricula);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cpf);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(login);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(senha);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(crea);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(tipo);
      out.write("</td>\n");
      out.write("                            <td><a href=\"editafuncionario.jsp?codigo=");
      out.print(codigo);
      out.write("&nome=");
      out.print(nome);
      out.write("&matricula=");
      out.print(matricula);
      out.write("&tipo=");
      out.print(tipo);
      out.write("&login=");
      out.print(login);
      out.write("&cpf=");
      out.print(cpf);
      out.write("&senha=");
      out.print(senha);
      out.write("&crea=");
      out.print(crea);
      out.write("\">Editar</a>                        \n");
      out.write("                                <a href=\"deletafuncionario.jsp?codigo=");
      out.print(codigo);
      out.write("&nome=");
      out.print(nome);
      out.write("&matricula=");
      out.print(matricula);
      out.write("&tipo=");
      out.print(tipo);
      out.write("&login=");
      out.print(login);
      out.write("&cpf=");
      out.print(cpf);
      out.write("&senha=");
      out.print(senha);
      out.write("&crea=");
      out.print(crea);
      out.write("\">Remover</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                       ");
 }               
                                    
                        
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("                <a href=\"cadastrafuncionarios.jsp\"> Cadastrar Funcionário</a>\n");
      out.write("            </form>          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
