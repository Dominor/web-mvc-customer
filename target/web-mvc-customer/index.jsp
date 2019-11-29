<jsp:useBean id="customer" scope="request" type="org.academiadecodigo.splicegirls36.model.Customer"/>
<html>
<body>
<div class="card">
    <p>${customer.name}</p>
    <p>${customer.email}</p>
</div>
</body>
</html>
