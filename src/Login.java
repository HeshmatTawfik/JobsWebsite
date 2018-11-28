import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String loginEmail = request.getParameter("email");
        String logInpass = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        User userLogin = new User(loginEmail, logInpass);

       //  if (UserDAO.userLogin(new User().getName(), new User().getPass(), new User())){
        if (UserDAO.userLogin(userLogin.getEmail(), userLogin.getPass(), userLogin)) {
            HttpSession session = request.getSession();
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            session.setAttribute("email", loginEmail);
            session.setAttribute("username",userLogin.getName());
            response.sendRedirect("ProfilePage");
            session.setAttribute("userSession", "loggedin");
        } else {
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            out.println("Username or Password incorrect");
            rs.include(request, response);
        }


    }


}
