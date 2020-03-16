<%-- 
    Document   : manutencaofuncionarios
    Created on : 20/02/2016, 17:34:55
    Author     : Andre Bessa
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.epicontrol.Model.Funcionario"%>
<%@page import="br.epicontrol.Persistence.PersistenciaFuncionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="funcionarioBean" class="br.epicontrol.Persistence.PersistenciaFuncionario" scope="session" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilos/estilos.css" rel="stylesheet" type="text/css"/>        
        <title>Página de Manutenção</title>
    </head>
    <body>
        <div id="content" style= "text-align: center;"><h1>&nbsp;&nbsp;&nbsp;Controle de EPI - Equipamento de Proteção Individual</h1></div>
        <div id="content" style= "text-align: center;"><h1>Manutenção de Funcionários</h1></div>
        <div id="content" style= "text-align: center;">
            <form action="action">
                <table width="100%" border="1px" bgcolor="#CCC">
                    <tr>
                        <td>Código</td>
                        <td>Nome</td>
                        <td>Matrícula</td>
                        <td>C.P.F.</td>
                        <td>Login</td>
                         <td>Senha</td>
                        <td>Crea</td>
                        <td>Tipo</td>
                        <td>Ação</td>
                    </tr>
                        
                    <!-- Retrive de funcionarios-->    
                       <% 
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
                       %>
                         
                       <tr>
                            <td><%=codigo%></td>
                            <td><%=nome%></td>
                            <td><%=matricula%></td>
                            <td><%=cpf%></td>
                            <td><%=login%></td>
                            <td><%=senha%></td>
                            <td><%=crea%></td>
                            <td><%=tipo%></td>
                            <td><a href="editafuncionario.jsp?codigo=<%=codigo%>&nome=<%=nome%>&matricula=<%=matricula%>&tipo=<%=tipo%>&login=<%=login%>&cpf=<%=cpf%>&senha=<%=senha%>&crea=<%=crea%>">Editar</a>                        
                                <a href="deletafuncionario.jsp?codigo=<%=codigo%>&nome=<%=nome%>&matricula=<%=matricula%>&tipo=<%=tipo%>&login=<%=login%>&cpf=<%=cpf%>&senha=<%=senha%>&crea=<%=crea%>">Remover</a>
                            </td>
                        </tr>
                        
                       <% }               
                                    
                        
                    %>
                </table>
                </br>
                </br>
                <a href="cadastrafuncionarios.jsp"> Cadastrar Funcionário</a>
            </form>          
        </div>
        
        
        
    </body>
</html>
