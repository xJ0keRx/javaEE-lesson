import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count") ;

        if (count == null){
            session.setAttribute("count", 1);
            count = 1;
        }
        else {
            session.setAttribute("count", ++count);
        }


//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
//        pw.println("<h1> Hello "+ name + " " + surname + "!</h1>");
        pw.println("<h1> Your count is: " + count + " </h1>");
        pw.println("</html>");


    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}