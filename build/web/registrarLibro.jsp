<%-- 
    Document   : registrarLibro
    Created on : 9 nov 2024, 8:16:24
    Author     : Janeth
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registrar Libro</title>
</head>
<body>
    <div class="container mt-5">
        <h2>Registrar un Libro</h2>
        <form action="RegistrarLibroServlet" method="post">
            <div class="form-group">
                <label for="titulo">Título</label>
                <input type="text" class="form-control" id="titulo" name="titulo" required>
            </div>
            <div class="form-group">
                <label for="autor">Autor</label>
                <input type="text" class="form-control" id="autor" name="autor" required>
            </div>
            <div class="form-group">
                <label for="tipoPasta">Tipo de Pasta</label>
                <select class="form-control" id="tipoPasta" name="tipoPasta">
                    <option value="1">Dura</option>
                    <option value="2">Blanda</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Registrar</button>
        </form>
    </div>
</body>
</html>
