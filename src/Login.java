import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet{
    protected   void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        try{
            String email=request.getParameter("email");
            String password=request.getParameter("pass");
            Connection con=ConnectionManger.getConnection();
            String employerSqlLogin="select * from employer where EMPLOYERNAME='"+email+"'"+" and EMPLOYERPASS='"+password+"'";
            String applicantSqlLogin="select * from applicant where APPLICANTNAME='"+email+"'"+" and APPLICANTPASS='"+password+"'";

        }
        catch (Exception e){
        }
    }



}
