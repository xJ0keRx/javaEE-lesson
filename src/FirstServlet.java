import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("hello world");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hello World!!! </h1>");
        pw.println("</html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}