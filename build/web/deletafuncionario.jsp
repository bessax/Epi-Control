<%-- 
    Document   : editafuncionario
    Created on : 29/02/2016, 21:36:15
    Author     : Andre Bessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Edição de Funcionários</title>
    </head>
    <body>
        <div id="content" style="text-align: center;"><h1>Controle de EPI - Equipamento de Proteção Individual</h1></div>
        <div id="content" style= "text-align: center;"><h1>Deleção de Funcionários</h1></div>
        <div id="content">
            <form action="ControllerServlet" method="post">               
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
                    </tr>
                    <tr>
                        
                        <td><%=request.getParameter("codigo")%></td> 
                        <td><input type="text" name="nome" value="<%=request.getParameter("nome")%>"></td> 
                        <td><input type="text" name="matricula" value="<%=request.getParameter("matricula")%>"></td> 
                        <td><input type="text" name="cpf" value="<%=request.getParameter("cpf")%>"></td> 
                        <td><input type="text" name="login" value="<%=request.getParameter("login")%>"></td> 
                        <td><input type="text" name="senha" value="<%=request.getParameter("senha")%>"></td> 
                        <td><input type="text" name="crea" value="<%=request.getParameter("crea")%>"></td> 
                        <td><input type="text" name="tipo" value="<%=request.getParameter("tipo")%>"></td>
                        <input type="hidden" name="codigo" value="<%=request.getParameter("codigo")%>" >
                        <input type="hidden" name="ac" value="delete">                    
                    </tr>                   
                </table>
                 <input type="submit" value="Deletar">                   
                 <a href="manutencaofuncionarios.jsp"> Cancelar</a>
            </form>
            
        </div>
    </body>
</html>
