import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("User successfully connected!");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hello "+ name + " " + surname + "!</h1>");
        pw.println("</html>");
        response.sendRedirect("https://www.google.com");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}