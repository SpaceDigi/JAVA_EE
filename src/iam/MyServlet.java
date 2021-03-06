package iam;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/MyServlet", urlPatterns = {"/"})
public class MyServlet extends HttpServlet {
    public MyServlet() {
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String user = req.getParameter("login");
        String pass = req.getParameter("password");
        if(user!=null && pass!=null&&user.equals("admin")&&(pass.equals("admin"))){
            resp.sendRedirect("random.jsp");
        }
        else{
            PrintWriter pWriter = resp.getWriter();
            pWriter.println("Oops.");
            RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
            rd.include(req,resp);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
