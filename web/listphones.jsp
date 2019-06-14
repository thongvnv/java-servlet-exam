<%@ page import="entity.Phone" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Phone> phones = (ArrayList<Phone>) request.getAttribute("phones");
    if (phones == null) {
        phones = new ArrayList<>();
    }
%>
<html>
<head>
    <title>Listphone</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="text-center">List phone</h1>
    <table class="table table-striped">
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Brand</th>
            <th scope="col">Price</th>
            <th scope="col">Description</th>
        </tr>
        <%
            for (Phone phone :
                    phones) {
        %>
        <tr>
            <td><%= phone.getId() %></td>
            <td><%= phone.getName() %></td>
            <td><%= phone.getBrand() %></td>
            <td><%= phone.getPrice() %></td>
            <td><%= phone.getDescription() %></td>
        </tr>
        <%}%>
    </table>
</div>

</body>
</html>
