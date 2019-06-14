<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add phone</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/phone" method="post">
    <div class="form-group">
        <label>Name</label>
        <input type="text" class="form-control" name="name" placeholder="Name">
        <%--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
    </div>
    <div class="form-group">
        <label>Brand</label>
        <input type="text" class="form-control" name="brand" placeholder="Brand">
        <%--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
    </div>
    <div class="form-group">
        <label>Price</label>
        <input type="text" class="form-control" name="price" placeholder="Price">
        <%--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
    </div>
    <div class="form-group">
        <label>Description</label>
        <input type="text" class="form-control" name="description" placeholder="Description">
        <%--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
