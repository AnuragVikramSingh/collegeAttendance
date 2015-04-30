import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/AddFacultyServlet"})
public class AddFacultyServlet extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
           // Exception p=new Exception();
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            String name=request.getParameter("name");
            String br=request.getParameter("branch");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            String sqes=request.getParameter("sques");
            String ans=request.getParameter("ans");
            DBAddFaculty obj=new DBAddFaculty(name,pass,sqes,ans,br,email);
            boolean result=true;
            result=obj.store();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddFacultyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if(result)
            {
                out.println("<h1>Faculty Added Succesfully</h1>");
            }
            else
                out.println("<h1>Faculty Not Added Succesfully</h1>");
                out.println("</body>");
                out.println("</html>");
        }
       
    }

  

}
