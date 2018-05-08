import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.*;  
import javax.servlet.annotation.WebFilter;


@WebFilter(filterName = "MyFilter", urlPatterns = {"/filter1"})
  
public class MyFilter implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
          
    String password=req.getParameter("password");  

    if(password.equals("admin")){  
        // RequestDispatcher rd=req.getRequestDispatcher("/filter1"); 
        chain.doFilter(req, resp);//sends request to next resource  
    }



    else{  
    out.print("username or password error!");  
    // RequestDispatcher rd=req.getRequestDispatcher("/webapp/index.jsp");  
    // extracted(req, resp);  
    }  
          
}


    public void destroy() {}  
  
}  