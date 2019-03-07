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

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String nome = req.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nome);

        Banco banco = new Banco();

        banco.add(empresa);

        req.setAttribute("empresa", empresa.getNome());

        resp.sendRedirect("listaEmpresas");

        /*RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
        req.setAttribute("empresa", empresa.getNome());
        rd.forward(req, resp);*/
    }
}
