<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 100vh;
        }
        .container {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
            margin-bottom: 30px;
        }
        h2, h3 {
            color: #333;
            margin-bottom: 15px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            font-weight: 600;
            margin-bottom: 5px;
            color: #555;
        }
        input[type="text"], input[type="number"] {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 14px;
            width: 100%;
        }
        button {
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #0056b3;
        }
        .results {
            width: 90%;
            max-width: 1000px;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        td {
            background-color: #f9f9f9;
        }
    </style>

</head>
<body>
 <div class="container">
        <h2>Search Product</h2>
        <form action="getsearch" method="post">
            <div class="form-group">
                <label for="companyName">Company Name</label>
                <input type="text" id="companyName" name="companyName" required>
            </div>
            <div class="form-group">
                <label for="locationId">Location ID</label>
                <input type="number" id="locationId" name="locationId" required>
            </div>
            <button type="submit">Search</button>
        </form>
    </div>


    <h3>Search Results:</h3>
    
        <table border="1">
            <tr>
             <th>Comapny Name</th>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Product Prize</th>
                <th>Product Location ID</th>
                <th>MAC Address</th>
                <th>Edit</th>
                
            </tr>
            <c:forEach var="product" items="${products}">
                <form action="editProduct" method="post">
                <tr>
                <td>${product.companyName}</td>
                    <td><input type="text" value="${product.prodId}" style=" border: none;
                     background: transparent;" name="prodId"	readonly="readonly"></td>
                    <td><input type="text" value="${product.prodName}" name="prodName" style=" border: none;
                     background: transparent;"	> </td>
                    <td>${product.prodDescription}</td>
                    <td><input type="text" value="${product.prodPrize}" name="prodPrize" style=" border: none;
                     background: transparent;"	></td>
                    <td>${product.prodLocationId}</td>
                    <td>${product.macAddress}</td>
                      <td><button type="submit">Edit</button></td>
                </tr>
                </form>
            </c:forEach>
        </table>
    
</body>
</html>