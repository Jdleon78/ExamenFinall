<%-- 
    Document   : mostrarLibros
    Created on : 9 nov 2024, 8:13:57
    Author     : Janeth
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Libros Registrados</title>
</head>
<body>
    <div class="container mt-5">
        <h2>Libros Registrados</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Autor</th>
                    <th>Tipo de Pasta</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="libro" items="${libros}">
                    <tr>
                        <td>${libro.id}</td>
                        <td>${libro.titulo}</td>
                        <td>${libro.autor}</td>
                        <td>${libro.tipoPasta}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
