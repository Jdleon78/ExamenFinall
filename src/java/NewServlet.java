import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrarLibroServlet")
public class NewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        int tipoPasta = Integer.parseInt(request.getParameter("tipoPasta"));
        
        Libro libro = new Libro(titulo, autor, tipoPasta);
        LibroDAO libroDAO = new LibroDAO();
        
        libroDAO.registrarLibro(libro);
        
        response.sendRedirect("mostrarLibros.jsp");
    }
}
