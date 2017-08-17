package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@WebServlet("/addphoto")
//@MultipartConfig(maxFileSize = 16177215)

public class AddPhotoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Apache Commons-Fileupload library classes
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload sfu  = new ServletFileUpload(factory);

            if (! ServletFileUpload.isMultipartContent(request)) {
                System.out.println("sorry. No file uploaded");
                return;
            }

            // parse request
            List items = sfu.parseRequest(request);
            FileItem  id = (FileItem) items.get(0);
            String productname =  id.getString();
            
            FileItem title = (FileItem) items.get(1);
            String   price =  title.getString();
            
            
            FileItem productdesc = (FileItem) items.get(2);
            String   desc =  productdesc.getString();

            // get uploaded file
            FileItem file = (FileItem) items.get(3);
            
            FileItem productcategory = (FileItem) items.get(4);
            String   category =  productcategory.getString();
            
            FileItem productstock = (FileItem) items.get(5);
            String   stock =  productstock.getString();
                        
            // Connect to Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MINOR", "minor");
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into PRODUCT (PRODUCTNAME,PRODUCTPRICE,PRODUCTDESC,PRODUCTIMAGE,PRODUCTCATEGORY,PRODUCTSTOCK) values(?,?,?,?,?,?)");
            ps.setString(1, productname);
            ps.setString(2, price);
            ps.setString(3, desc);
            // size must be converted to int otherwise it results in error
            ps.setBinaryStream(4, file.getInputStream(), (int) file.getSize());
            ps.setString(5, category);
            ps.setString(6, stock);
            ps.executeUpdate();
            con.commit();
            con.close();
            out.println("Photo Added Successfully. <p> <a href='listphotos'>List Photos </a>");
            request.getSession().setAttribute("proname", productname); 
            request.getRequestDispatcher("imagedownload.jsp").forward(request, response);
        }
        catch(Exception ex) {
            out.println( "Error --> " + ex.getMessage());
        }
    } 
}