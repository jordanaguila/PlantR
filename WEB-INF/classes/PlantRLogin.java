import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class PlantRLogin extends HttpServlet
{
     protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
     {

       PrintWriter writer = res.getWriter();
       int count = 0;
       String file = "/Applications/Tomcat/webapps/PlantR/WEB-INF/classes/user.csv";
       BufferedReader br = new BufferedReader(new FileReader(file));
       String line = "";
       String[] content = new String[10];

       while ((line = br.readLine()) != null) {

         content = line.split(",");

       }
       br.close();

       int i = 0;
       String username = req.getParameter("uname");

       while(i < content.length){
         if(username.equals(content[i])){
           boolean user = true;
         }
         i += 1;
       }


       String password = req.getParameter("psw");
       i = 0;
       while(i < content.length){
         if(username.equals(content[i + 1])){
           boolean pass = true;
         }
         i += 1;
       }







     }
}
