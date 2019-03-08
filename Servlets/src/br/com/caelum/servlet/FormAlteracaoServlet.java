package br.com.caelum.servlet;

import br.com.caelum.model.Banco;
import br.com.caelum.model.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/alteraEmpresa")
public class FormAlteracaoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        Banco banco = new Banco();
        Empresa empresa = banco.buscaPorID(id);
        req.setAttribute("empresa", empresa);
        RequestDispatcher rd = req.getRequestDispatcher("/alteraEmpresa.jsp");
        rd.forward(req,resp);
    }
}


