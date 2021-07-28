package br.edu.infnet.app.contacts;

import br.edu.infnet.domain.contacts.Address;
import br.edu.infnet.infra.contacts.AddressService;
import org.apache.commons.lang.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddressController", value = "/AddressController")
public class AddressController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cep = request.getParameter("cep");
        if (StringUtils.isNotBlank(cep)) {
            AddressService as = new AddressService();
            Address adr = as.getByZipCode(cep);
            request.setAttribute("address", adr);
        } else {
            request.setAttribute("error", "Invalid CEP");
        }

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
