<%-- 
    Document   : Default
    Created on : 20/02/2016, 10:13:53
    Author     : Andre Bessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="javascript.js" type="text/javascript"></script>
        <title>Menu Principal - Controle de EPI</title>
    </head>
    <body>
        <div id="content"><h1>&nbsp;&nbsp;&nbsp;Controle de EPI - Equipamento de Proteção Individual</h1></div>
        <div id="content">            
                <ul class="menu"> <!-- Esse é o 1 nivel ou o nivel principal -->              
                  <li><a href="#">Manutenção & Cadastros</a>
                      <ul class="submenu-1">
                        <li><a href="#">Funcionário</a>
                            <ul class="submenu-2">
                                <li><a href="cadastrafuncionarios.jsp">Cadastro</a></li>
                                <li><a href="manutencaofuncionarios.jsp">Manutenção</a> </li>
                            </ul>
                         </li>                                        
                      </ul>               
                  </li>
                  <li><a href="#">Requisição de EPI</a></li>
                  <li><a href="#">Relatórios</a></li>
                  <li><a href="sobre.jsp">Sobre</a></li>
                </ul>           
        </div>
        
        
    </body>
</html>
