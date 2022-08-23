package ir.mehrshad.controller;

import ir.mehrshad.entity.Borrow;
import ir.mehrshad.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/borrow")
public class BorrowServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <form action=\"http://localhost:8080/Libraryservlet_war/borrow\">\n" +
                "        user id: <input type=\"text\" placeholder=\"enter user id\">\n" +
                "        book id: <input type=\"text\" placeholder=\"enter book id\">\n" +
                "        date: <input type=\"date\" placeholder=\"enter date\">\n" +
                "        <input type=\"submit\" value=\"save\">\n" +
                "\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("1"));
        Long bookId = Long.parseLong(req.getParameter("1"));
        LocalDate date = LocalDate.parse(req.getParameter("25/02/2021"));
        Long userId = Long.parseLong(req.getParameter("1"));
        Borrow borrow = new Borrow(userId , bookId , date);
        Borrow borrow1 = ApplicationContext.getInstance().getBorrowService().updateOrSave(borrow);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <form action=\"http://localhost:8080/Libraryservlet_war/borrow\">\n" +
                "        user id: <input type=\"text\" placeholder=\"enter user id\">\n" +
                "        book id: <input type=\"text\" placeholder=\"enter book id\">\n" +
                "        date: <input type=\"date\" placeholder=\"enter date\">\n" +
                "        <input type=\"submit\" value=\"save\">\n" +
                "\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");
        resp.sendRedirect("show-list-borrow");

    }
}
