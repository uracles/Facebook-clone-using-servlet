package com.uracles.facebookclone.servlets;

import com.uracles.facebookclone.dao.UserDao;
import com.uracles.facebookclone.enums.Gender;
import com.uracles.facebookclone.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signup")
public class RegistrationServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String firstname=req.getParameter("firstname");
        System.out.println(firstname);
        String lastname=req.getParameter("lastname");
        System.out.println(lastname);
        String email=req.getParameter("email");
        String password=req.getParameter("password");
//        String dateOfBirth = req.getParameter("birthday_year") + "-" +
//                req.getParameter("birthday_month") + "-" +
//                req.getParameter("birthday_day");
//        Date dob = Date.valueOf(dateOfBirth);
        Gender gender = Gender.valueOf(req.getParameter("gender").toUpperCase());

        User user=new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);
        user.setPassword(password);
//        user.setDateOfBirth(dob);
        user.setGender(gender);

        int status= UserDao.userRegistration(user);
        if(status >= 0){
            out.print("<p>Data has been saved successfully!</p>");
            resp.sendRedirect("signin.jsp");
            req.getRequestDispatcher("index.jsp").include(req, resp);

        }else{
            out.println("Sorry! unable to Register data");
        }
        out.close();

    }


}
