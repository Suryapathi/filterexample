import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.annotation.WebServlet;


  



@WebServlet(name = "AdminServlet", urlPatterns = {"/filter1"})
public class AdminServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
        response.setContentType("text/html");  
           response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();  
          
        out.print("welcome ADMIN");  
        out.close();  
    }  
} 