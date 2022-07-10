package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/index")
public class HelloIndex extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        if (name == null) {
            name = "world";
        }
        PrintWriter pw = resp.getWriter();
        pw.write("<h1>index, " + name + "!</h1>");
        pw.flush();
//        ModelAndView p = new ModelAndView();
//        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }
}

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write("\"logout successful\"");
        pw.flush();
//        ModelAndView p = new ModelAndView();
//        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }
}
