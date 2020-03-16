<%-- 
    Document   : cadastrafuncionarios
    Created on : 20/02/2016, 17:34:01
    Author     : Andre Bessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Cadastro de Funcionários</title>
    </head>
    <body>
        <div id="content" style="text-align: center;"><h1>Controle de EPI - Equipamento de Proteção Individual</h1></div>
        <div id="content" style= "text-align: center;"><h1>Cadastro de Funcionários</h1></div>
        <div id="content">
            <form action="ControllerServlet" method="post">                
               <fieldset id="login">
               <legend><span>Dados Pessoais</span></legend>
                    <ol>
                         <li>
                             <label for="nome" title="Informe Nome"> Nome Completo:<span>*</span></label><input type="text" name="name">
                         </li>
                         <li>
                           <label for="cpf" title="Informe CPF"> CPF:<span>*</span></label><input type="text" name="cpf"> 
                         </li> 
                         
                         <li>
                           <label for="matricula" title="Informe Matrícula"> Matrícula:<span>*</span></label><input type="text" name="mat"> 
                         </li>
                        
                         
                     </ol>
               </fieldset>               
               <fieldset>
                     <legend><span>Técnico Segurança</span></legend>
                    <ol>
                         <li>
                             <label for="login" title="Informe Login"> Login:<span></span></label><input type="text" name="login">
                         </li>
                         <li>
                           <label for="password" title="Informe Senha"> Senha:<span></span></label><input type="password" name="psw"> 
                         </li> 
                         <li>
                           <label for="crea" title="Informe Nº CREA"> C.R.E.A:<span>*</span></label><input type="text" name="crea"> 
                         </li>                
                         
                     </ol>
               </fieldset> 
                <fieldset >
                    <input type="hidden" name="ac" value="create"></input>
                    <input type="submit" value="Cadastrar">   
                    <a href="default.jsp"> Cancelar</a>                 
                </fieldset>
                
            </form> 
          </div>
    </body>
</html>
