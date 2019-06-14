package controller;

import entity.Phone;
import model.PhoneModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class PhoneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PhoneModel phoneModel = new PhoneModel();
        ArrayList<Phone> listPhone = phoneModel.getAllPhone();
        req.setAttribute("phones", listPhone);
        req.getRequestDispatcher("listphones.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String price = req.getParameter("price");
        String description = req.getParameter("description");

        Phone phone = new Phone(name, brand, price, description);
        PhoneModel phoneModel = new PhoneModel();
        phoneModel.addPhone(phone);
    }
}
