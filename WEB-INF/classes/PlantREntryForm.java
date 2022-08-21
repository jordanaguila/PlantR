import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class PlantREntryForm extends HttpServlet
{
     protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
     {

       File file = new File("/Applications/Tomcat/webapps/PlantR/WEB-INF/classes/plants.csv");
       Scanner fileReader = new Scanner(file);
       FileWriter fStream = new FileWriter(file, true);
       BufferedWriter myWriter = new BufferedWriter(fStream);
       PrintWriter writer = res.getWriter();


       String plant_name = req.getParameter("Plant Name");
       String plant_des = req.getParameter("Plant Discription");
       String plant_pic = req.getParameter("Plant Photo");

       myWriter.write(plant_name + ",");
       myWriter.write(plant_des + ",");
       myWriter.write(plant_pic + ".png,");

       myWriter.close();


       String htmlResponse = "<html>";
       htmlResponse += "<h2>done</h2>";

       writer.println(htmlResponse);





     }
}
