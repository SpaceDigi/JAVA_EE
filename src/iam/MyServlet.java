package iam;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    public MyServlet() {
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter var3 = resp.getWriter();

        String param1 = req.getParameter("name");
        String param2 = req.getParameter("pass");
        if (!"".equals(param1) && !"".equals(param2)&&param1!=null&&param2!=null) {
            if(param1.equals("LOGIN")&&param2.equals("PASSWORD")) {
                PrintWriter out = resp.getWriter();

                out.write("<html><body><div style='text-align: center;'>");
                out.write("<p style='color: green; font-size: larger;'>GOOD</p>");
                out.close();
            }else{
                PrintWriter out = resp.getWriter();

                out.write("<html><body><div style='text-align: center;'>");
                out.write("<p style='color: red; font-size: larger;'>BAD, try again</p>");
                out.close();
            }
        }
        else {
            try {
                var3.println("<html>");
                var3.println("<head>");
                var3.println("<title>Login page</title>");
                var3.println("</head>");
                var3.println("<body>");

                var3.println("<form method = \"POST\">First Name: <input type = \"text\" name = \"name\">" +
                        "<br />" +
                        "Password: <input type = \"text\" name = \"pass\" /> " +
                        "<input type = \"submit\" value = \"Submit\" /> </form>");

                var3.println("</body>");
                var3.println("</html>");
            } finally {
                var3.close();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
