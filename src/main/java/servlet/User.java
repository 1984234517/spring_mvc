package servlet;

import model.School;
import model.User1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user")
public class User extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // 假装从数据库读取:
            School school = new School("No.1 Middle School", "101 South Street");
            User1 user = new User1(123, "Bob", school);
            // 放入Request中:
            req.setAttribute("user1", user);
            // forward给user.jsp:
            req.getRequestDispatcher("/WEB-INF/User.jsp").forward(req, resp);
        }
}




