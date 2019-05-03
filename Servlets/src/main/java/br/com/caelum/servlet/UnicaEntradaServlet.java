package br.com.caelum.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramAcao = req.getParameter("acao");

        if(paramAcao.equals("listaEmpresa")){
            System.out.println("Listando Empresas");
        } else if(paramAcao.equals("removeEmpresa")){
            System.out.println("Removendo Empresa");
        } else if(paramAcao.equals("removeEmpresa")){
            System.out.println("Removendo Empresa");
        }
    }
}
