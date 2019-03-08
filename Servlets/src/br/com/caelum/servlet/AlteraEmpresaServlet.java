package br.com.caelum.servlet;

import br.com.caelum.model.Banco;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sucessoAlteracao")
public class AlteraEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        Banco banco = new Banco();
        banco.altera(id, nome);
        resp.sendRedirect("listaEmpresas");
    }
}