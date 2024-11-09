import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    private ConexionBD conexionDB = new ConexionBD();  

   
    public void registrarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, tipo_pasta_id) VALUES (?, ?, ?)";

        try (Connection connection = conexionDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setInt(3, libro.getTipoPastaId());  
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT l.id, l.titulo, l.autor, tp.descripcion AS tipoPasta " +
                     "FROM libros l INNER JOIN tipos_pasta tp ON l.tipo_pasta_id = tp.id";

        try (Connection connection = conexionDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
               
                Libro libro = new Libro(
                    resultSet.getString("titulo"),           // Título del libro
                    resultSet.getString("autor"),            // Autor del libro
                    resultSet.getString("tipoPasta")         // Descripción del tipo de pasta
                );
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libros;
    }
}
