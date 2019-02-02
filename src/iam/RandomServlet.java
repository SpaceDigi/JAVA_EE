package iam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "/RandomServlet", urlPatterns = {"/Random"})
public class RandomServlet extends HttpServlet {
    public RandomServlet() {
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        double perc = Math.random();
        String res;
        if(perc>0.5)
            res = "Yes";
        else
            res ="No";
        PrintWriter pWriter = resp.getWriter();
        pWriter.println(res);
        RequestDispatcher rd = req.getRequestDispatcher("random.jsp");
        req.setAttribute("rand",res);
        rd.forward(req,resp);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}