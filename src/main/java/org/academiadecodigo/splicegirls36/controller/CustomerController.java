package org.academiadecodigo.splicegirls36.controller;

import org.academiadecodigo.splicegirls36.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Customer customer = new Customer();
        customer.setName("bsCustomer");
        customer.setEmail("bla@bs.xyz");
        req.setAttribute("customer", customer);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/templates/index.jsp");
        dispatcher.forward(req, resp);
    }
}
